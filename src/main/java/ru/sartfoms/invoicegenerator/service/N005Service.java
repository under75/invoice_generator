package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.N005Repository;

@Service
public class N005Service {
	private final N005Repository n005Repository;

	public N005Service(N005Repository n005Repository) {
		this.n005Repository = n005Repository;
	}

	public boolean isValid(Integer id) {
		return !n005Repository.findAllById1AndExpDateIsNull(id).isEmpty();
	}
}
