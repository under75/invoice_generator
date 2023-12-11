package ru.sartfoms.invoicegenerator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RESULT", schema = "LPUOWNER")
public class V009 {
	@Id
	@Column(name = "idrmp")
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
