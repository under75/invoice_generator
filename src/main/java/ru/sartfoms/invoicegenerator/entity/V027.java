package ru.sartfoms.invoicegenerator.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "V027", schema = "LPUOWNER")
public class V027 {
	@Id
	private Integer idcz;

	public Integer getIdcz() {
		return idcz;
	}

	public void setIdcz(Integer idcz) {
		this.idcz = idcz;
	}
	
}
