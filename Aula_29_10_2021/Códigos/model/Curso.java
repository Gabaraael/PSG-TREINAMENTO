package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TB_Cursos")
public class Curso{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")	
	private Integer cursoID;
	
	@Column(name = "DESCR")	
	private Integer descricao;

	public Integer getCursoID() {
		return cursoID;
	}

	public void setCursoID(Integer cursoID) {
		this.cursoID = cursoID;
	}

	public Integer getDescricao() {
		return descricao;
	}

	public void setDescricao(Integer descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Curso [cursoID=" + cursoID + ", descricao=" + descricao + "]";
	}

	public Curso(Integer cursoID, Integer descricao) {
		super();
		this.cursoID = cursoID;
		this.descricao = descricao;
	}
		
	public Curso() {
		
	}
	

	

}
