package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.V010Repository;

@Service
public class V010Service {
	private final V010Repository v010Repository;

	public V010Service(V010Repository v010Repository) {
		this.v010Repository = v010Repository;
	}

	public boolean existsById(Integer id) {
		return v010Repository.existsByIdAndExpDateIsNull(id);
	}
}
