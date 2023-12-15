package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.V020Repository;

@Service
public class V020Service {
	private final V020Repository v020Repository;
	
	public V020Service(V020Repository v020Repository) {
		this.v020Repository = v020Repository;
	}

	public boolean existsById(Integer id) {
		return v020Repository.existsById(id);
	}
}
