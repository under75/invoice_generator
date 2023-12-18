package ru.sartfoms.invoicegenerator.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.CompositeKey2;
import ru.sartfoms.invoicegenerator.entity.N001;

public interface N001Repository extends JpaRepository<N001, CompositeKey2> {

	Collection<N001> findAllById1AndExpDateIsNull(Integer id1);

}
