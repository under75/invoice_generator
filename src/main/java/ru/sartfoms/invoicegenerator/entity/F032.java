package ru.sartfoms.invoicegenerator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ЛПУ", schema = "LPUOWNER")
public class F032 {
	@Id
	@Column(name="cd_lpu")
	private Integer lpuId;

	public Integer getLpuId() {
		return lpuId;
	}

	public void setLpuId(Integer lpuId) {
		this.lpuId = lpuId;
	}
	
}
