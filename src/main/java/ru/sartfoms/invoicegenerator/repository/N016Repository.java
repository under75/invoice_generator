package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.N016;

public interface N016Repository extends JpaRepository<N016, CompositeKey2> {

	Collection<N016> findAllById1AndExpDateIsNull(Integer id1);

}
