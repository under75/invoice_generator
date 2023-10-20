package ru.sartfoms.invoicegenerator.xml;

import java.io.InputStream;

import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.springframework.stereotype.Component;

import generated.ObjectFactory;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;

@Component
public class Unmarshaller {

	public JAXBElement<?> unmarshal(InputStream inputStream) throws JAXBException {
		JAXBContext context = JAXBContextFactory.createContext(new Class[] { ObjectFactory.class }, null);

		return (JAXBElement<?>) context.createUnmarshaller().unmarshal(inputStream);
	}

}
