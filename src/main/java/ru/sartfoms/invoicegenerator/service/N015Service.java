package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.N015Repository;

@Service
public class N015Service {
	private final N015Repository n015Repository;

	public N015Service(N015Repository n015Repository) {
		this.n015Repository = n015Repository;
	}

	public boolean isValid(Integer id1) {
		return !n015Repository.findAllById1AndExpDateIsNull(id1).isEmpty();
	}
}
