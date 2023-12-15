package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.N003;

public interface N003Repository extends JpaRepository<N003, CompositeKey2> {

	Collection<N003> findAllById1AndExpDateIsNull(Integer id1);

}
