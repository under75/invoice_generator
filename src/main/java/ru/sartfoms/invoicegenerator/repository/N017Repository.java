package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.N017;

public interface N017Repository extends JpaRepository<N017, CompositeKey2> {
	Collection<N017> findAllById1AndExpDateIsNull(Integer id1);
}
