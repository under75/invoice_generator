package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.F003Repository;

@Service
public class F003Service {
	private final F003Repository f003Repository;

	public F003Service(F003Repository f003Repository) {
		this.f003Repository = f003Repository;
	}

	public boolean existsById(Integer codeMo) {
		return f003Repository.existsById(codeMo);
	}
}
