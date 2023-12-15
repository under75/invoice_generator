package ru.sartfoms.invoicegenerator.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class CompositeKey2 implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id1;

	private LocalDate effDate;

	public LocalDate getEffDate() {
		return effDate;
	}

	public void setEffDate(LocalDate effDate) {
		this.effDate = effDate;
	}

	public Integer getId1() {
		return id1;
	}

	public void setId1(Integer id1) {
		this.id1 = id1;
	}
	
}
