package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.N015;

public interface N015Repository extends JpaRepository<N015, CompositeKey2> {

	Collection<N015> findAllById1AndExpDateIsNull(Integer id1);

}
