package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.F032Repository;

@Service
public class F032Service {
	private final F032Repository f032Repository;

	public F032Service(F032Repository f032Repository) {
		this.f032Repository = f032Repository;
	}

	public boolean existsById(Integer codeMo) {
		return f032Repository.existsById(codeMo);
	}
}
