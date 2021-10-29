package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_Distrito")
public class Distrito {
	
	@Id
	@Column(name = "ID")
	private Integer distritoID;
	
	@Column(name = "DESCR")
	private String descricao;
	
	@Column(name = "SiglaUF")
	private char siglaUF;

	public Integer getDistritoID() {
		return distritoID;
	}

	public void setDistritoID(Integer distritoID) {
		this.distritoID = distritoID;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public char getSiglaUF() {
		return siglaUF;
	}

	public void setSiglaUF(char siglaUF) {
		this.siglaUF = siglaUF;
	}

	@Override
	public String toString() {
		return "Distrito [distritoID=" + distritoID + ", descricao=" + descricao + ", siglaUF=" + siglaUF + "]";
	}

	public Distrito(Integer distritoID, String descricao, char siglaUF) {
		super();
		this.distritoID = distritoID;
		this.descricao = descricao;
		this.siglaUF = siglaUF;
	}
	
	public Distrito() {
		
	}
}
