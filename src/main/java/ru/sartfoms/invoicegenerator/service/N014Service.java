package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.N014Repository;

@Service
public class N014Service {
	private final N014Repository n014Repository;
	
	public N014Service(N014Repository n014Repository) {
		this.n014Repository = n014Repository;
	}

	public boolean isValid(Integer id1) {
		return !n014Repository.findAllById1AndExpDateIsNull(id1).isEmpty();
	}
}
