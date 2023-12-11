package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.V008Repository;

@Service
public class V008Service {
	private final V008Repository v008Repository;
	
	public V008Service(V008Repository v008Repository) {
		this.v008Repository = v008Repository;
	}

	public boolean existsById(Integer vidpom) {
		return v008Repository.existsById(vidpom);
	}
}
