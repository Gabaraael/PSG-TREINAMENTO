package com.mycompany.atividadesacocheio.pojo;

import java.math.*;
import java.util.*;

public class FuncionarioPojo extends CamposDeData {

    private int funcionarioID;

    private long chaveID;

    private int paisID;

    private String nome;

    private String sobreNome;

    private char sexo;

    private Date dataNascimento;
    
    private Date dataDeAdmissao;

    private String email;

    private String ctps;

    private long ctpsNum;

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

    public FuncionarioPojo() {

    }

    public Date getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(Date dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }
}
