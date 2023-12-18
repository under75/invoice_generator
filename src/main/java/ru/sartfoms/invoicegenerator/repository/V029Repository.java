package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.V029;

public interface V029Repository extends JpaRepository<V029, CompositeKey2> {

	Collection<V029> findAllById1AndExpDateIsNull(Integer id);

}
