package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.N002Repository;

@Service
public class N002Service {
	private final N002Repository n002Repository;
	
	public N002Service(N002Repository n002Repository) {
		this.n002Repository = n002Repository;
	}

	public boolean isValid(Integer idst) {
		return n002Repository.findAllById1AndExpDateIsNull(idst).size() > 0;
	}
}
