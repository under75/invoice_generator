package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.F010Repository;

@Service
public class F010Service {
	private final F010Repository f010Repository;
	
	public F010Service(F010Repository f010Repository) {
		this.f010Repository = f010Repository;
	}

	public boolean existsById(String code) {
		return f010Repository.existsById(code);
	}
}
