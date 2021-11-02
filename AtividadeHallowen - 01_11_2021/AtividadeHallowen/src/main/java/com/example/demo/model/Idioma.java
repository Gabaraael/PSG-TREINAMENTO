package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_Idiomas")
public class Idioma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer idiomaID;

	@Column(name = "ABREVIADO")
	private String sigla;

	@Column(name = "DESCRICAO")
	private String descricao;

	public Integer getIdiomaID() {
		return idiomaID;
	}

	public void setIdiomaID(Integer idiomaID) {
		this.idiomaID = idiomaID;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Idioma [idiomaID=" + idiomaID + ", sigla=" + sigla + ", descricao=" + descricao + "]";
	}

	public Idioma(Integer idiomaID, String sigla, String descricao) {
		super();
		this.idiomaID = idiomaID;
		this.sigla = sigla;
		this.descricao = descricao;
	}
	
	public Idioma() {
		
	}
	

	
	
	

}
