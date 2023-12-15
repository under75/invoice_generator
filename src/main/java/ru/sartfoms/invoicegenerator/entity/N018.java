package ru.sartfoms.invoicegenerator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "N018", schema = "LPUOWNER")
public class N018 {
	@Id
	@Column(name="id_reas")
	private Integer idreas;

	public Integer getIdreas() {
		return idreas;
	}

	public void setIdreas(Integer idreas) {
		this.idreas = idreas;
	}
	
}
