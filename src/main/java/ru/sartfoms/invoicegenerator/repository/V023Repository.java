package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey3;
import ru.sartfoms.invoicegenerator.entity.V023;

public interface V023Repository extends JpaRepository<V023, CompositeKey3>{

	Collection<V023> findAllById1AndExpDateIsNull(String nksg);

}
