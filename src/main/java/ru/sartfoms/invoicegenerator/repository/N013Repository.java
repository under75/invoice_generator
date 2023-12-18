package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.N013;

public interface N013Repository extends JpaRepository<N013, CompositeKey2> {

	Collection<N013> findAllById1AndExpDateIsNull(Integer id1);

}
