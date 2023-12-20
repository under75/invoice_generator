package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.V023Repository;

@Service
public class V023Service {
	private final V023Repository v023Repository;
	
	public V023Service(V023Repository v023Repository) {
		this.v023Repository = v023Repository;
	}

	public boolean isValid(String nksg) {
		return !v023Repository.findAllById1AndExpDateIsNull(nksg).isEmpty();
	}
}
