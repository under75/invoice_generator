package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.V027Repository;

@Service
public class V027Service {
	private final V027Repository v027Repository;

	public V027Service(V027Repository v027Repository) {
		this.v027Repository = v027Repository;
	}

	public boolean existsById(Integer id) {
		return v027Repository.existsById(id);
	}
}
