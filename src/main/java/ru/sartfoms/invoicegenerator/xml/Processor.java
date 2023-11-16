package ru.sartfoms.invoicegenerator.xml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Enumeration;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.commons.io.FileUtils;
import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import generated.Flk;
import generated.MedrabFile;
import generated.ObjectFactory;
import generated.PersonFile;
import generated.SvedMedpom;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.sartfoms.invoicegenerator.exception.ProcessException;
import ru.sartfoms.invoicegenerator.validator.Q015ValidatorC;
import ru.sartfoms.invoicegenerator.validator.Q015ValidatorH;
import ru.sartfoms.invoicegenerator.validator.Q015ValidatorL;
import ru.sartfoms.invoicegenerator.validator.Q015ValidatorT;
import ru.sartfoms.invoicegenerator.validator.Q015ValidatorX;

@Component
public class Processor {
	@Value("${xmldata.outside.dir}")
	private String outsideDir;
	@Value("${xmldata.inside.dir}")
	private String insideDir;
	private final static String TMP = "/TMP";
	private final Q015ValidatorL q15ValidatorL;
	private final Q015ValidatorH q15ValidatorH;
	private final Q015ValidatorC q15ValidatorC;
	private final Q015ValidatorX q15ValidatorX;
	private final Q015ValidatorT q15ValidatorT;

	public Processor(Q015ValidatorL q15ValidatorL, Q015ValidatorH q15ValidatorH, Q015ValidatorC q15ValidatorC,
			Q015ValidatorT q15ValidatorT, Q015ValidatorX q15ValidatorX) {
		this.q15ValidatorL = q15ValidatorL;
		this.q15ValidatorH = q15ValidatorH;
		this.q15ValidatorC = q15ValidatorC;
		this.q15ValidatorX = q15ValidatorX;
		this.q15ValidatorT = q15ValidatorT;
	}

	@Scheduled(cron = "0 0/1 8-23 * * *")
	private void run() throws IOException, ProcessException {
		FileUtils.copyDirectory(new File(outsideDir), new File(insideDir + TMP));
		FileUtils.cleanDirectory(new File(outsideDir));

		try (Stream<Path> stream = Files.list(Paths.get(insideDir + TMP))) {
			Flux.fromStream(stream.map(t -> t.toFile())).subscribe(f -> {
				try {
					process(f);
					FileUtils.copyToDirectory(f, new File(insideDir + "/" + getActualFolder()));
//					FileUtils.delete(f);
				} catch (IOException | JAXBException e) {
					throw new ProcessException(e);
				}
			});
		}
	}

	private String getActualFolder() {
		return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
	}

	private void process(File zip) throws IOException, JAXBException {
		try (ZipFile zipfile = new ZipFile(zip);) {
			Enumeration<? extends ZipEntry> entries = zipfile.entries();
			Mono<PersonFile> personFileMono = null;
			Mono<MedrabFile> medrabFileMono = null;
			Mono<SvedMedpom> svedMedpomMono = null;
			while (entries.hasMoreElements()) {
				ZipEntry entry = entries.nextElement();
				String key = entry.getName().substring(0, 1).toLowerCase();
				if (key.equals("l")) {
					PersonFile personFile = (PersonFile) unmarshal(zipfile.getInputStream(entry)).getValue();
					personFileMono = Mono.just(personFile);
				} else if (key.equals("v")) {
					MedrabFile medrabFile = (MedrabFile) unmarshal(zipfile.getInputStream(entry)).getValue();
					medrabFileMono = Mono.just(medrabFile);
				} else if (key.equals("h") || key.equals("d") || key.equals("t") || key.equals("c")) {
					SvedMedpom svedMedpom = (SvedMedpom) unmarshal(zipfile.getInputStream(entry)).getValue();
					svedMedpomMono = Mono.just(svedMedpom);
				}
			}
			Flk flk =  createFlk(zipfile);
			Mono.zip(personFileMono, medrabFileMono, svedMedpomMono, Mono.just(flk)).subscribe(m -> {
				q15ValidatorL.validate(m);
				q15ValidatorH.validate(m);
				q15ValidatorC.validate(m);
				q15ValidatorT.validate(m);
				q15ValidatorX.validate(m);
			});
			marshal(flk);
		}
	}

	private Flk createFlk(ZipFile zipfile) {
		String zipName = zipfile.getName().substring(zipfile.getName().lastIndexOf("\\") + 1);
		String fNameI = zipName.replaceFirst(".+_(.+_.+).zip", "$1");
		String fName = fNameI.matches("h(m.+)(t64)(_.+)") ? fNameI.replaceAll("h(m.+)(t64)(_.+)", "v$2$1$3")
				: fNameI.replaceFirst("\\w(\\w)(.+)(t64)(_.+)", "V$1$3$2$4");
		Flk flk = new Flk();
		flk.setFNAME(fName);
		flk.setFNAMEI(fNameI);
		
		return flk;
	}

	private JAXBElement<?> unmarshal(InputStream inputStream) throws JAXBException {
		JAXBContext context = JAXBContextFactory.createContext(new Class[] { ObjectFactory.class }, null);

		return (JAXBElement<?>) context.createUnmarshaller().unmarshal(inputStream);
	}

	private void marshal(Flk flk) throws JAXBException {
		JAXBContext context = org.eclipse.persistence.jaxb.JAXBContextFactory.createContext(new Class[] { Flk.class },
				null);
		Marshaller jaxbMarshaller = context.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(flk, System.out);
	}

}
