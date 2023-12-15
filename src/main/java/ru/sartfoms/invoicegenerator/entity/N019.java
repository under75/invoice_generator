package ru.sartfoms.invoicegenerator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "N019", schema = "LPUOWNER")
public class N019 {
	@Id
	@Column(name="id_cons")
	private Integer idcons;

	public Integer getIdcons() {
		return idcons;
	}

	public void setIdcons(Integer idcons) {
		this.idcons = idcons;
	}
	
}
