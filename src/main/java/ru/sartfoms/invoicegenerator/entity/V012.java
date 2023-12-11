package ru.sartfoms.invoicegenerator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ISHOD", schema = "LPUOWNER")
public class V012 {
	@Id
	@Column(name="idiz")
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
