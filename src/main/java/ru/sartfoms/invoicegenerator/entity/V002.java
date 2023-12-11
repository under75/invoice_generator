package ru.sartfoms.invoicegenerator.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "V002_V021", schema = "LPUOWNER")
@IdClass(CompositeKey1.class)
public class V002 {
	@Id
	private Integer idpr;
	@Id
	private Integer idspec;

	public Integer getIdpr() {
		return idpr;
	}

	public Integer getIdspec() {
		return idspec;
	}

	public void setIdpr(Integer idpr) {
		this.idpr = idpr;
	}

	public void setIdspec(Integer idspec) {
		this.idspec = idspec;
	}
}
