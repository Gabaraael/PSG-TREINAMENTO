package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "AreaConhecimento")
public class AreaConhecimento{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")	
	private Integer AreaConhecimentoID;
	
	@Column(name = "DESCR")	
	private String descricao;

	public Integer getAreaConhecimentoID() {
		return AreaConhecimentoID;
	}

	public void setAreaConhecimentoID(Integer areaConhecimentoID) {
		AreaConhecimentoID = areaConhecimentoID;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "AreaConhecimento [AreaConhecimentoID=" + AreaConhecimentoID + ", descricao=" + descricao + "]";
	}

	public AreaConhecimento(Integer areaConhecimentoID, String descricao) {
		super();
		AreaConhecimentoID = areaConhecimentoID;
		this.descricao = descricao;
	}
	
	public AreaConhecimento() {
		
	}
	
	

}
