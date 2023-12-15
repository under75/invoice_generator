package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.N003Repository;

@Service
public class N003Service {
	private final N003Repository n003Repository;
	
	public N003Service(N003Repository n003Repository) {
		this.n003Repository = n003Repository;
	}

	public boolean isValid(Integer id1) {
		return n003Repository.findAllById1AndExpDateIsNull(id1).size() > 0;
	}
}
