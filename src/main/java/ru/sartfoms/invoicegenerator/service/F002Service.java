package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.F002Repository;

@Service
public class F002Service {
	private final F002Repository f002Repository;

	public F002Service(F002Repository f002Repository) {
		this.f002Repository = f002Repository;
	}

	public boolean existsById(String id) {
		return f002Repository.existsById(id);
	}
}
