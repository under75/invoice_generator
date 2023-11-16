package ru.sartfoms.invoicegenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class InvoicegeneratorApplication {
	public static void main(String[] args) {
		SpringApplication.run(InvoicegeneratorApplication.class, args);
	}

}
