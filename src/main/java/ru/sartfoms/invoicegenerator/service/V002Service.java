package ru.sartfoms.invoicegenerator.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.entity.V002;
import ru.sartfoms.invoicegenerator.repository.V002Repository;

@Service
public class V002Service {
	private final V002Repository v002Repository;

	public V002Service(V002Repository v002Repository) {
		this.v002Repository = v002Repository;
	}

	public boolean existsByIdpr(Integer idpr) {
		Collection<V002> result =  v002Repository.findAllByIdpr(idpr);
		
		return result != null && result.size() > 0;
	}
}
