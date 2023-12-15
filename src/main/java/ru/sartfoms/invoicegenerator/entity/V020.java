package ru.sartfoms.invoicegenerator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "V020", schema = "LPUOWNER")
public class V020 {
	@Id
	@Column(name="idk_pr")
	private Integer idkpr;

	public Integer getIdkpr() {
		return idkpr;
	}

	public void setIdkpr(Integer idkpr) {
		this.idkpr = idkpr;
	}
	
}
