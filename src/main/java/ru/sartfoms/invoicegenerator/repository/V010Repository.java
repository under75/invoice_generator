package ru.sartfoms.invoicegenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.sartfoms.invoicegenerator.entity.V010;

public interface V010Repository extends JpaRepository<V010, Integer> {

	boolean existsByIdAndExpDateIsNull(Integer id);

}
