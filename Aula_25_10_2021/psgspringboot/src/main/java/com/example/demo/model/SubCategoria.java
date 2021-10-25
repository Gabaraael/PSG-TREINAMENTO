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
@Table(name = "SubCategorias")
public class SubCategoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer subCategoriaID;

	@Column(name = "ca")
	private Integer categoriaID;

	@Column(name = "Descricao")
	private String descricao;

	@Column(name = "Inclusao", nullable=true)
	@Temporal(value = TemporalType.DATE)
	private Date DataDeInsercao;
	
	public SubCategoria() {

	}
	
	public SubCategoria(Integer categoriaID, Integer subCategoriaID, String descricao, Date DataDeInsercao) {
		super();
		this.subCategoriaID = subCategoriaID;
		this.categoriaID = categoriaID;
		this.descricao = descricao;
		this.DataDeInsercao = DataDeInsercao;
	}	
	public Integer getSubCategoriaID() {
		return this.subCategoriaID;
	}

	public void setSubCategoriaID(Integer subCategoriaID) {
		this.subCategoriaID = subCategoriaID;
	}

	public Integer getCategoriaID() {
		return this.categoriaID;
	}

	public void setCategoriaID(Integer categoriaID) {
		this.categoriaID = categoriaID;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInsert() {
		return DataDeInsercao;
	}

	public void setDataInsert(Date dataDeInsercao) {
		DataDeInsercao = dataDeInsercao;
	}

	@Override
	public String toString() {
		return "SubCategoria [subCategoriaID=" + subCategoriaID + ", categoriaID=" + categoriaID + ", descricao="
				+ descricao + ", DataDeInsercao=" + DataDeInsercao + "]";
	}
}
