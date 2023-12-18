package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.N005;

public interface N005Repository extends JpaRepository<N005, CompositeKey2> {

	Collection<N005> findAllById1AndExpDateIsNull(Integer id);

}
