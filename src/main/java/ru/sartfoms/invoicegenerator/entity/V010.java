package ru.sartfoms.invoicegenerator.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SPOSOB", schema = "LPUOWNER")
public class V010 {
	@Id
	@Column(name = "idsp")
	private Integer id;
	
	@Column(name = "dateend")
	private LocalDate expDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
