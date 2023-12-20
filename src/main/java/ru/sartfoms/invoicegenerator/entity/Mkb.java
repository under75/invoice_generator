package ru.sartfoms.invoicegenerator.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "НОЗОЛОГИИ_МКБ", schema = "LPUOWNER")
public class Mkb {
	@Id
	private String mkb;

	public String getMkb() {
		return mkb;
	}

	public void setMkb(String mkb) {
		this.mkb = mkb;
	}
	
}
