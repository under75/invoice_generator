package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.N011Repository;

@Service
public class N011Service {
	private final N011Repository n011Repository;

	public N011Service(N011Repository n011Repository) {
		this.n011Repository = n011Repository;
	}

	public boolean isValid(Integer id1) {
		return !n011Repository.findAllById1AndExpDateIsNull(id1).isEmpty();
	}
}
