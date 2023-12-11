package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey1;
import ru.sartfoms.invoicegenerator.entity.V002;

public interface V002Repository extends JpaRepository<V002, CompositeKey1> {

	Collection<V002> findAllByIdpr(Integer idpr);

}
