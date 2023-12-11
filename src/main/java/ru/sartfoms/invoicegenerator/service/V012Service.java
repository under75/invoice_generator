package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.V012Repository;

@Service
public class V012Service {
	private final V012Repository v012Repository;
	
	public V012Service(V012Repository v012Repository) {
		this.v012Repository = v012Repository;
	}

	public boolean existsById(String id) {
		return v012Repository.existsById(id);
	}
}
