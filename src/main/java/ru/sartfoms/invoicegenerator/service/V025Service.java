package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.V025Repository;

@Service
public class V025Service {
	private final V025Repository v025Repository;
	
	public V025Service(V025Repository v025Repository) {
		this.v025Repository = v025Repository;
	}

	public boolean existsById(String pcel) {
		return v025Repository.existsById(pcel);
	}
}
