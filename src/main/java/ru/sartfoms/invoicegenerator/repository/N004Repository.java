package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.N004;

public interface N004Repository extends JpaRepository<N004, CompositeKey2> {

	Collection<N004> findAllById1AndExpDateIsNull(Integer id1);

}
