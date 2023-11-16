package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.entity.F011;
import ru.sartfoms.invoicegenerator.repository.F011Repository;

@Service
public class F011Service {
	private final F011Repository f011Repository;

	public F011Service(F011Repository f011Repository) {
		this.f011Repository = f011Repository;
	}

	public F011 findOne(Integer iddoc) {
		return f011Repository.getReferenceById(iddoc);
	}
}
