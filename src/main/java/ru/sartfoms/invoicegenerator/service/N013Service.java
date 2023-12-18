package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.N013Repository;

@Service
public class N013Service {
	private final N013Repository n013Repository;

	public N013Service(N013Repository n013Repository) {
		this.n013Repository = n013Repository;
	}

	public boolean isValid(Integer id1) {
		return !n013Repository.findAllById1AndExpDateIsNull(id1).isEmpty();
	}
}
