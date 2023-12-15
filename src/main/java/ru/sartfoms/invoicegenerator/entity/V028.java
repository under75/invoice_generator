package ru.sartfoms.invoicegenerator.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "V028", schema = "LPUOWNER")
public class V028 {
	@Id
	private Integer idvn;

	public Integer getIdvn() {
		return idvn;
	}

	public void setIdvn(Integer idvn) {
		this.idvn = idvn;
	}
	
}
