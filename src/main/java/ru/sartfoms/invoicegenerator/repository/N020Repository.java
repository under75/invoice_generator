package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey3;
import ru.sartfoms.invoicegenerator.entity.N020;

public interface N020Repository extends JpaRepository<N020, CompositeKey3> {

	Collection<N020> findAllById1AndExpDateIsNull(String id1);

}
