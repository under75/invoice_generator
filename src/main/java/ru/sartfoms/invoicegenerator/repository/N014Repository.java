package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.N014;

public interface N014Repository extends JpaRepository<N014, CompositeKey2> {

	Collection<N014> findAllById1AndExpDateIsNull(Integer id1);

}
