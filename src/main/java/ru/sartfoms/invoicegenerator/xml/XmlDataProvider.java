package ru.sartfoms.invoicegenerator.xml;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class XmlDataProvider {
	@Value("${xmldata.outside.dir}")
	private String outsideDir;
	@Value("${xmldata.inside.dir}")
	private String insideDir;
	private final static String TMP = "/TMP";
	
	@Scheduled(cron = "0 0/1 8-23 * * *")
	private void provide() throws IOException {
		FileUtils.copyDirectory(new File(outsideDir), new File(insideDir + TMP));
		FileUtils.cleanDirectory(new File(outsideDir));
	}

	private String getActualFolder() {
		return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
	}

	public Set<File> readAll() throws IOException {
		try (Stream<Path> stream = Files.list(Paths.get(insideDir + TMP))) {
			return stream.map(t->t.toFile()).collect(Collectors.toSet());
		}
	}

	public void moveToStorage(String pathToFile) throws IOException {
		FileUtils.copyFile(new File(pathToFile), new File(outsideDir + "/" + getActualFolder()));
	}

}
