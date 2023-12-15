package ru.sartfoms.invoicegenerator.xml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.xml.namespace.QName;

import org.apache.commons.io.FileUtils;
import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.springframework.beans.factory.annotation.Value;
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
import ru.sartfoms.invoicegenerator.exception.ProcessException;
import ru.sartfoms.invoicegenerator.model.Cortege;
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

//	@Scheduled(cron = "0 0/1 8-23 * * *")
	public void run() throws IOException, ProcessException {
		FileUtils.copyDirectory(new File(outsideDir), new File(insideDir + TMP));
		FileUtils.cleanDirectory(new File(outsideDir));

		Arrays.asList(new File(insideDir + TMP).listFiles()).parallelStream().peek(f -> {
			try {
				process(f);
//					FileUtils.copyToDirectory(f, new File(insideDir + "/" + getActualFolder()));
//					FileUtils.delete(f);
			} catch (IOException | JAXBException e) {
				throw new ProcessException(e);
			}
		}).count();

		System.out.println("---- DONE ----");
	}

	private String getActualFolder() {
		return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
	}

	/**
	 * Не проходят Q015ValidatorC{001F.00.0230}, Q015ValidatorL{003F.00.1710,
	 * 003F.00.1730, 003F.00.1740, 004F.00.1570}
	 **/
	private void process(File zip) throws IOException, JAXBException {
		try (ZipFile zipfile = new ZipFile(zip);) {
			Enumeration<? extends ZipEntry> entries = zipfile.entries();
			Cortege cortege = new Cortege();
			while (entries.hasMoreElements()) {
				ZipEntry entry = entries.nextElement();
				String key = entry.getName().substring(0, 1).toLowerCase();
				if (key.equals("l")) {
					cortege.setPersonFile((PersonFile) unmarshal(zipfile.getInputStream(entry)).getValue());
					cortege.setPersonFileName(entry.getName());
				} else if (key.equals("v")) {
					cortege.setMedrabFile((MedrabFile) unmarshal(zipfile.getInputStream(entry)).getValue());
					cortege.setMedrabFileName(entry.getName());
				} else if (key.equals("h") || key.equals("d") || key.equals("t") || key.equals("c")) {
					cortege.setSvedMedpom((SvedMedpom) unmarshal(zipfile.getInputStream(entry)).getValue());
					cortege.setSvedMedpomFileName(entry.getName());
				}
			}
			Flk flk = createFlk(zipfile);
			cortege.setFlk(flk);
//			q15ValidatorL.validate(cortege);
			String key = cortege.getSvedMedpomFileName().substring(0, 1).toLowerCase();
			switch (key) {
			case "c":
				q15ValidatorC.validate(cortege);
				break;
			case "t":
				q15ValidatorT.validate(cortege);
				break;
			case "h":
				q15ValidatorH.validate(cortege);
				break;
			default:
				break;
			}

			if (flk.getPR().size() > 0) {
				marshal(flk);
			}
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
		JAXBElement<Flk> jaxbElement = new JAXBElement<Flk>(new QName("", "FLK_P"), Flk.class, flk);

		jaxbMarshaller.marshal(jaxbElement, System.out);
	}

}
