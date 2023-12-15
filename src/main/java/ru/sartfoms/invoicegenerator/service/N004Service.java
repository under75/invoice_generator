package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.N004Repository;

@Service
public class N004Service {
	private final N004Repository n004Repository;
	
	public N004Service(N004Repository n004Repository) {
		this.n004Repository = n004Repository;
	}

	public boolean isValid(Integer id1) {
		return n004Repository.findAllById1AndExpDateIsNull(id1).size() > 0;
	}
}
