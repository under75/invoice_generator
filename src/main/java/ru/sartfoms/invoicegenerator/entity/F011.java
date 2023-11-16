package ru.sartfoms.invoicegenerator.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FO11", schema = "LPUOWNER")
public class F011 {
	private Integer iddoc;
	private Integer docser;
	private Integer docnum;

	public Integer getIddoc() {
		return iddoc;
	}

	public Integer getDocser() {
		return docser;
	}

	public Integer getDocnum() {
		return docnum;
	}

	public void setIddoc(Integer iddoc) {
		this.iddoc = iddoc;
	}

	public void setDocser(Integer docser) {
		this.docser = docser;
	}

	public void setDocnum(Integer docnum) {
		this.docnum = docnum;
	}

}
