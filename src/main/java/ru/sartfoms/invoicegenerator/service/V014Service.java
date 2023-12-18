package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.V014Repository;

@Service
public class V014Service {
	private final V014Repository v014Repository;

	public V014Service(V014Repository v014Repository) {
		this.v014Repository = v014Repository;
	}

	public boolean existsById(Integer id) {
		return !v014Repository.findAllById1AndExpDateIsNull(id).isEmpty();
	}
}
