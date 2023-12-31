package ru.sartfoms.invoicegenerator.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "V014", schema = "LPUOWNER")
@IdClass(CompositeKey2.class)
public class V014 {
	@Id
	@Column(name="idfrmmp")
	private Integer id1;

	@Id
	@Column(name="datebeg")
	private LocalDate effDate;
	
	@Column(name="dateend")
	private LocalDate expDate;

	public Integer getId1() {
		return id1;
	}

	public LocalDate getEffDate() {
		return effDate;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setId1(Integer id1) {
		this.id1 = id1;
	}

	public void setEffDate(LocalDate effDate) {
		this.effDate = effDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
}
