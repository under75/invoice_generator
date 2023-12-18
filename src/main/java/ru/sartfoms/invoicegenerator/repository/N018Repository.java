package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.N018;

public interface N018Repository extends JpaRepository<N018, CompositeKey2> {

	Collection<N018> findAllById1AndExpDateIsNull(Integer id);

}
