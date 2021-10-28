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
@Table(name = "DeptoPorFunc")
public class DepPorFunc{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DeptoPorFuncID")	
	private Integer deptoPorFuncID;
	
	@Column(name = "FuncionarioID")	
	private Integer funcID;
	
	@Column(name = "DepartamentoID")	
	private Integer depID;	
	
	@Column(name = "DataInicial", nullable=true)
	@Temporal(value = TemporalType.DATE)
	private Date dataInicial;
	
	@Column(name = "DataFinal", nullable=true)
	@Temporal(value = TemporalType.DATE)
	private Date dataFinal;

	

	
	public Integer getDeptoPorFuncID() {
		return deptoPorFuncID;
	}

	public void setDeptoPorFuncID(Integer deptoPorFuncID) {
		this.deptoPorFuncID = deptoPorFuncID;
	}

	public Integer getFuncID() {
		return funcID;
	}

	public void setFuncID(Integer funcID) {
		this.funcID = funcID;
	}

	public Integer getDepID() {
		return depID;
	}

	public void setDepID(Integer depID) {
		this.depID = depID;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	@Override
	public String toString() {
		return "Departamento [deptoPorFuncID=" + deptoPorFuncID + ", funcID=" + funcID + ", depID=" + depID
				+ ", dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + "]";
	}

	public DepPorFunc(Integer deptoPorFuncID, Integer funcID, Integer depID, Date dataInicial, Date dataFinal) {
		super();
		this.deptoPorFuncID = deptoPorFuncID;
		this.funcID = funcID;
		this.depID = depID;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}
	public DepPorFunc() {}
}
