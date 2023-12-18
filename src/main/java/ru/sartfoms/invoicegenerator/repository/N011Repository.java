package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.N011;

public interface N011Repository extends JpaRepository<N011, CompositeKey2> {

	Collection<N011> findAllById1AndExpDateIsNull(Integer id1);

}
