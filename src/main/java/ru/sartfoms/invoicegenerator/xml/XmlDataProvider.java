package ru.sartfoms.invoicegenerator.xml;

import java.io.File;
import java.io.IOException;

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

	@Scheduled(cron = "0 0/1 8-23 * * *")
	protected void provide() {
		try {
			FileUtils.copyDirectory(new File(outsideDir), new File(insideDir));
			FileUtils.cleanDirectory(new File(outsideDir));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
