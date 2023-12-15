package ru.sartfoms.invoicegenerator.entity;

import java.io.Serializable;

public class CompositeKey1 implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idpr;

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
