package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.N007Repository;

@Service
public class N007Service {
	private final N007Repository n007Repository;

	public N007Service(N007Repository n007Repository) {
		this.n007Repository = n007Repository;
	}

	public boolean isValid(Integer id1) {
		return !n007Repository.findAllById1AndExpDateIsNull(id1).isEmpty();
	}
}
