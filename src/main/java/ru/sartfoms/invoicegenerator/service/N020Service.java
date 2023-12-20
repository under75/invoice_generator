package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.N020Repository;

@Service
public class N020Service {
	private final N020Repository n020Repository;
	
	public N020Service(N020Repository n020Repository) {
		this.n020Repository = n020Repository;
	}

	public boolean isValid(String id1) {
		return !n020Repository.findAllById1AndExpDateIsNull(id1).isEmpty();
	}
}
