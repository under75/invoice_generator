package ru.sartfoms.invoicegenerator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PERV_PERSON_V4", schema="LPUOWNER")
public class PervPersonV4 {
	@Id
	@Column(name = "ID_P")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "svedmedpom_seq")
	@SequenceGenerator(name = "svedmedpom_seq", sequenceName = "LPUOWNER.SVEDMEDPOM_SEQ", allocationSize = 1000)
	private Long id;
	
	@Column(name = "ID_FILE")
	private Long fileId;
	
	@Column(name = "ID_PAC")
	private Long patientId;
	
	@Column(name = "FAM")
	private String lastname;
	
	@Column(name = "IM")
	private String firstname;
	
	@Column(name = "OT")
	private String patronymic;
	
	@Column(name = "W")
	private String gender;
}
