package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.V024Repository;

@Service
public class V024Service {
	private final V024Repository v024Repository;

	public V024Service(V024Repository v024Repository) {
		this.v024Repository = v024Repository;
	}

	public boolean isValid(String codesh) {
		return !v024Repository.findAllById1AndExpDateIsNull(codesh).isEmpty();
	}
}
