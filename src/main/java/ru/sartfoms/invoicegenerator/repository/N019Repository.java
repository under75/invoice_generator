package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.N019;

public interface N019Repository extends JpaRepository<N019, CompositeKey2> {

	Collection<N019> findById1AndExpDateIsNull(Integer prcons);

}
