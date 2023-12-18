package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.V014;

public interface V014Repository extends JpaRepository<V014, CompositeKey2> {

	Collection<V014> findAllById1AndExpDateIsNull(Integer id);

}
