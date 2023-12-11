package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.V009Repository;

@Service
public class V009Service {
	private final V009Repository v009Repository;
	
	public V009Service(V009Repository v009Repository) {
		this.v009Repository = v009Repository;
	}

	public boolean existsById(String rslt) {
		return v009Repository.existsById(rslt);
	}
}
