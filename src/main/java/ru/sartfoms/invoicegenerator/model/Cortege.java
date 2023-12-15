package ru.sartfoms.invoicegenerator.model;

import generated.Flk;
import generated.MedrabFile;
import generated.PersonFile;
import generated.SvedMedpom;

public class Cortege{
	private SvedMedpom svedMedpom;
	private String svedMedpomFileName;
	
	private PersonFile personFile;
	private String personFileName;
	
	private MedrabFile medrabFile;
	private String medrabFileName;
	
	private Flk flk;
	
	public SvedMedpom getSvedMedpom() {
		return svedMedpom;
	}
	public String getSvedMedpomFileName() {
		return svedMedpomFileName;
	}
	public PersonFile getPersonFile() {
		return personFile;
	}
	public String getPersonFileName() {
		return personFileName;
	}
	public MedrabFile getMedrabFile() {
		return medrabFile;
	}
	public String getMedrabFileName() {
		return medrabFileName;
	}
	public void setSvedMedpom(SvedMedpom svedMedpom) {
		this.svedMedpom = svedMedpom;
	}
	public void setSvedMedpomFileName(String svedMedpomFileName) {
		this.svedMedpomFileName = svedMedpomFileName;
	}
	public void setPersonFile(PersonFile personFile) {
		this.personFile = personFile;
	}
	public void setPersonFileName(String personFileName) {
		this.personFileName = personFileName;
	}
	public void setMedrabFile(MedrabFile medrabFile) {
		this.medrabFile = medrabFile;
	}
	public void setMedrabFileName(String medrabFileName) {
		this.medrabFileName = medrabFileName;
	}
	public Flk getFlk() {
		return flk;
	}
	public void setFlk(Flk flk) {
		this.flk = flk;
	}
}
