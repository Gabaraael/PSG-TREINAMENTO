package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Departamento{

	@Id
	
	@Column(name = "DepartamentoID")	
	private Integer departamentoID;
	
	@Column(name = "Nome")	
	private String nome;	
	
	@Column(name = "DataInsert", nullable=true)
	@Temporal(value = TemporalType.DATE)
	private Date dataInsert;

	public Integer getDepartamentoID() {
		return departamentoID;
	}

	public void setDepartamentoID(Integer departamentoID) {
		this.departamentoID = departamentoID;
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
		return "Departamento [departamentoID=" + departamentoID + ", nome=" + nome + ", dataInsert=" + dataInsert + "]";
	}

	public Departamento(Integer departamentoID, String nome, Date dataInsert) {
		super();
		this.departamentoID = departamentoID;
		this.nome = nome;
		this.dataInsert = dataInsert;
	}
	
	public Departamento() {}
}

	
