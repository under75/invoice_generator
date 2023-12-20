package ru.sartfoms.invoicegenerator.service;

import org.springframework.stereotype.Service;

import ru.sartfoms.invoicegenerator.repository.MkbRepository;

@Service
public class MkbService {
	private final MkbRepository mkbRepository;
	
	public MkbService(MkbRepository mkbRepository) {
		this.mkbRepository = mkbRepository;
	}

	public boolean isBetweenExcludingTo(String ds1, String from, String to) {
		return mkbRepository.findByMkbGreaterThanEqualAndMkbLessThan(from, to).stream().anyMatch(t->t.getMkb().equals(ds1));
	}

	public boolean isBetweenExcludingFromAndTo(String ds1, String from, String to) {
		return mkbRepository.findByMkbGreaterThanAndMkbLessThan(from, to).stream().anyMatch(t->t.getMkb().equals(ds1));

	}
}
