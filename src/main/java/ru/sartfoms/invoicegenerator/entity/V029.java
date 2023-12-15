package ru.sartfoms.invoicegenerator.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "V029", schema = "LPUOWNER")
public class V029 {
	@Id
	private Integer idmet;

	public Integer getIdmet() {
		return idmet;
	}

	public void setIdmet(Integer idmet) {
		this.idmet = idmet;
	}

}
