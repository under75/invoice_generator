package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.N017Repository;

@Service
public class N017Service {
	private final N017Repository n017Repository;
	
	public N017Service(N017Repository n017Repository) {
		this.n017Repository = n017Repository;
	}

	public boolean isValid(Integer id1) {
		return !n017Repository.findAllById1AndExpDateIsNull(id1).isEmpty();
	}
}
