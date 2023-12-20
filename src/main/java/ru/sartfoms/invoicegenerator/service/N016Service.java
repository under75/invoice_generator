package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.N016Repository;

@Service
public class N016Service {
	private final N016Repository n016Repository;
	
	public N016Service(N016Repository n016Repository) {
		this.n016Repository = n016Repository;
	}

	public boolean isValid(Integer id1) {
		return !n016Repository.findAllById1AndExpDateIsNull(id1).isEmpty();
	}
}
