package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey3;
import ru.sartfoms.invoicegenerator.entity.V024;

public interface V024Repository extends JpaRepository<V024, CompositeKey3> {

	Collection<V024> findAllById1AndExpDateIsNull(String codesh);

}
