package ru.sartfoms.invoicegenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import ru.sartfoms.invoicegenerator.xml.Unmarshaller;

@SpringBootApplication
@EnableScheduling
public class InvoicegeneratorApplication {
	@Autowired
	Unmarshaller unmarshaller;

	public static void main(String[] args) {
		SpringApplication.run(InvoicegeneratorApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner CommandLineRunnerBean() {
//		return (args) -> {
//			InputStream inputStream = new ClassPathResource("xmldata/hm640030t64_2310307516204749.xml",
//					InvoicegeneratorApplication.class.getClassLoader()).getInputStream();
//			JAXBElement<?> jaxbElement = unmarshaller.unmarshal(inputStream);
//			System.err.println(jaxbElement.getValue());
//		};
//	}

}
