package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.V021Repository;

@Service
public class V021Service {
	private final V021Repository v021Repository;
	
	public V021Service(V021Repository v021Repository) {
		this.v021Repository = v021Repository;
	}

	public boolean existsById(Integer id) {
		return v021Repository.existsById(id);
	}
}
