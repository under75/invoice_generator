package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.Mkb;

public interface MkbRepository extends JpaRepository<Mkb, String> {

	Collection<Mkb> findByMkbGreaterThanEqualAndMkbLessThan(String from, String to);

	Collection<Mkb> findByMkbGreaterThanAndMkbLessThan(String from, String to);

}
