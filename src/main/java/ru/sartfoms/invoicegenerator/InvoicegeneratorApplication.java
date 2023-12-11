package ru.sartfoms.invoicegenerator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import ru.sartfoms.invoicegenerator.xml.Processor;

@SpringBootApplication
@EnableScheduling
public class InvoicegeneratorApplication {
	public static void main(String[] args) {
		SpringApplication.run(InvoicegeneratorApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner CommandLineRunnerBean(Processor processor) {
		return (args) -> {
			processor.run();
		};
	}

}
