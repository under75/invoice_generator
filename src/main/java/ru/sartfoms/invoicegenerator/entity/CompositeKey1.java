package ru.sartfoms.invoicegenerator.entity;

import java.io.Serializable;

import javax.persistence.Id;

public class CompositeKey1 implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private Integer idpr;
	@Id
	private Integer idspec;

	public Integer getIdpr() {
		return idpr;
	}

	public Integer getIdspec() {
		return idspec;
	}

	public void setIdpr(Integer idpr) {
		this.idpr = idpr;
	}

	public void setIdspec(Integer idspec) {
		this.idspec = idspec;
	}
}
