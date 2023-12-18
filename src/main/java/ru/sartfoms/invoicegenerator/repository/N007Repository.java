package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.N007;

public interface N007Repository extends JpaRepository<N007, CompositeKey2> {

	Collection<N007> findAllById1AndExpDateIsNull(Integer id1);

}
