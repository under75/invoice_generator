package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.N019Repository;

@Service
public class N019Service {
	private final N019Repository n019Repository;
	
	public N019Service(N019Repository n019Repository) {
		this.n019Repository = n019Repository;
	}

	public boolean isValid(Integer prcons) {
		return !n019Repository.findById1AndExpDateIsNull(prcons).isEmpty();
	}
}
