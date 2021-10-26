package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Departamento{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DepartamentoID")	
	private Integer DepID;
	
	@Column(name = "Nome")	
	private String nome;	
	
	@Column(name = "DataInsert", nullable=true)
	@Temporal(value = TemporalType.DATE)
	private Date dataInsert;

	public Integer getDepID() {
		return DepID;
	}

	public void setDepID(Integer depID) {
		DepID = depID;
	}

	public String getNome() {
		return nome;
	}

	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataInsert() {
		return dataInsert;
	}

	public void setDataInsert(Date dataInsert) {
		this.dataInsert = dataInsert;
	}
	
	@Override
	public String toString() {
		return "Departamento [DepID=" + DepID + ", nome=" + nome + ", dataInsert=" + dataInsert + "]";
	}

	public Departamento(Integer depID, String nome, Date dataInsert) {
		super();
		DepID = depID;
		this.nome = nome;
		this.dataInsert = dataInsert;
	}
	
	public Departamento() {}
	
	
	
}

	
