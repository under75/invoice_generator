package ru.sartfoms.invoicegenerator.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "V023", schema = "LPUOWNER")
@IdClass(CompositeKey3.class)
public class V023 {
	@Id
	@Column(name = "k_ksg")
	private String id1;
	
	@Id
	@Column(name="datebeg")
	private LocalDate effDate;
	
	@Column(name="dateend")
	private LocalDate expDate;

	public String getId1() {
		return id1;
	}

	public LocalDate getEffDate() {
		return effDate;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setId1(String id1) {
		this.id1 = id1;
	}

	public void setEffDate(LocalDate effDate) {
		this.effDate = effDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	
}
