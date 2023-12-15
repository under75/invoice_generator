package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.V028Repository;

@Service
public class V028Service {
	private final V028Repository v028Repository;

	public V028Service(V028Repository v028Repository) {
		this.v028Repository = v028Repository;
	}

	public boolean existsById(Integer id) {
		return v028Repository.existsById(id);
	}
}
