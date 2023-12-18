package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.N008Repository;

@Service
public class N008Service {
	private final N008Repository n008Repository;
	
	public N008Service(N008Repository n008Repository) {
		this.n008Repository = n008Repository;
	}

	public boolean isValid(Integer id1) {
		return !n008Repository.findAllById1AndExpDateIsNull(id1).isEmpty();
	}
}
