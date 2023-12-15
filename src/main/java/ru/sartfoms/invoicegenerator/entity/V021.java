package ru.sartfoms.invoicegenerator.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "V021", schema = "LPUOWNER")
public class V021 {
	@Id
	private Integer idspec;

	public Integer getIdspec() {
		return idspec;
	}

	public void setIdspec(Integer idspec) {
		this.idspec = idspec;
	}
	
}
