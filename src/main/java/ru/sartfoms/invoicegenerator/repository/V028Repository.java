package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.V028;

public interface V028Repository extends JpaRepository<V028, CompositeKey2> {

	Collection<V028> findAllById1AndExpDateIsNull(Integer id);

}
