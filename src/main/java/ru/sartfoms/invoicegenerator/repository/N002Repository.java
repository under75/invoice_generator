package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.N002;

public interface N002Repository extends JpaRepository<N002, CompositeKey2> {

	Collection<N002> findAllById1AndExpDateIsNull(Integer idst);

}
