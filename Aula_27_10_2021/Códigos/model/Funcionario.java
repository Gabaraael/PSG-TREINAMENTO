package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Funcionario")
public class Funcionario {
	@Id

	@Column(name = "FuncionarioID")
	private int funcionarioID;
	@Column(name = "Chave")
	private long chaveID;
	@Column(name = "PaisID")
	private int paisID;
	@Column(name = "Nome")
	private String nome;
	@Column(name = "SobreNome")
	private String sobreNome;
	@Column(name = "Sexo")
	private char sexo;
	@Column(name = "DataNascimento")
	private Date dataNascimento;
	@Column(name = "DataAdmissao")
	private Date dataDeAdmissao;
	@Column(name = "Email")
	private String email;
	@Column(name = "Ctps")
	private String ctps;
	@Column(name = "CtpsNum")
	private long ctpsNum;
	@Column(name = "CtpsSerie")
	private int ctpsSerie;

	public int getFuncionarioID() {
		return funcionarioID;
	}

	public void setFuncionarioID(int funcionarioID) {
		this.funcionarioID = funcionarioID;
	}

	public int getPaisID() {
		return paisID;
	}

	public void setPaisID(int paisID) {
		this.paisID = paisID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public long getCtpsNum() {
		return ctpsNum;
	}

	public void setCtpsNum(long ctpsNum) {
		this.ctpsNum = ctpsNum;
	}

	public int getCtpsSerie() {
		return ctpsSerie;
	}

	public void setCtpsSerie(int ctpsSerie) {
		this.ctpsSerie = ctpsSerie;
	}

	public long getChaveID() {
		return chaveID;
	}

	public void setChaveID(long chaveID) {
		this.chaveID = chaveID;
	}

	public Funcionario() {

	}

	public Date getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(Date dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
}
