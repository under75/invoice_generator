package ru.sartfoms.invoicegenerator.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class CompositeKey3 implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id1;

	private LocalDate effDate;

	public String getId1() {
		return id1;
	}

	public LocalDate getEffDate() {
		return effDate;
	}

	public void setId1(String id1) {
		this.id1 = id1;
	}

	public void setEffDate(LocalDate effDate) {
		this.effDate = effDate;
	}
}
