package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.V029Repository;

@Service
public class V029Service {
	private final V029Repository v029Repository;

	public V029Service(V029Repository v029Repository) {
		this.v029Repository = v029Repository;
	}

	public boolean isValid(Integer id) {
		return !v029Repository.findAllById1AndExpDateIsNull(id).isEmpty();
	}
}
