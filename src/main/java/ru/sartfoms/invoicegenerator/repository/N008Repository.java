package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.N008;

public interface N008Repository extends JpaRepository<N008, CompositeKey2> {

	Collection<N008> findAllById1AndExpDateIsNull(Integer id1);

}
