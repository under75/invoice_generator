package ru.sartfoms.invoicegenerator.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "V025", schema = "LPUOWNER")
public class V025 {
	@Id
	private String idpc;

	public String getIdpc() {
		return idpc;
	}

	public void setIdpc(String idpc) {
		this.idpc = idpc;
	}
	
}
