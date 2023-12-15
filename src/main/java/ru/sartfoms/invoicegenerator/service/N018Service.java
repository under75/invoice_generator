package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.N018Repository;

@Service
public class N018Service {
	private final N018Repository n018Repository;
	
	public N018Service(N018Repository n018Repository) {
		this.n018Repository = n018Repository;
	}

	public boolean existsById(Integer id) {
		return n018Repository.existsById(id);
	}
}
