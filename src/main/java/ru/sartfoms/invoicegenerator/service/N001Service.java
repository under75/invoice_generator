package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.N001Repository;

@Service
public class N001Service {
	private final N001Repository n001Repository;

	public N001Service(N001Repository n001Repository) {
		this.n001Repository = n001Repository;
	}

	public boolean isValid(Integer id1) {
		return !n001Repository.findAllById1AndExpDateIsNull(id1).isEmpty();
	}
}
