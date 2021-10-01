/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meow;

import java.util.*;

/**
 *
 * @author LAB03
 */
public class Funcionario extends CamposDeData{
    private int funcionarioID;
    private int paisID;
    private String nome;
    private String sobrenome;
    private Date dataAdmissao;
    private String email;
    private String ctps;
    private long ctpsNum;
    private int ctpsSerie;
    private Pais pais;
    
  


  public Funcionario(Pais pais){
        this.pais = pais;    
}
    

    /**
     * @return the funcionarioID
     */
    public int getFuncionarioID() {
        return funcionarioID;
    }

    /**
     * @param funcionarioID the funcionarioID to set
     */
    public void setFuncionarioID(int funcionarioID) {
        this.funcionarioID = funcionarioID;
    }

    /**
     * @return the paisID
     */
    public int getPaisID() {
        return paisID;
    }

    /**
     * @param paisID the paisID to set
     */
    public void setPaisID(int paisID) {
        this.paisID = paisID;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the dataAdmissao
     */
    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    /**
     * @param dataAdmissao the dataAdmissao to set
     */
    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the ctps
     */
    public String getCtps() {
        return ctps;
    }

    /**
     * @param ctps the ctps to set
     */
    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    /**
     * @return the ctpsNum
     */
    public long getCtpsNum() {
        return ctpsNum;
    }

    /**
     * @param ctpsNum the ctpsNum to set
     */
    public void setCtpsNum(long ctpsNum) {
        this.ctpsNum = ctpsNum;
    }

    /**
     * @return the ctpsSerie
     */
    public int getCtpsSerie() {
        return ctpsSerie;
    }

    /**
     * @param ctpsSerie the ctpsSerie to set
     */
    public void setCtpsSerie(int ctpsSerie) {
        this.ctpsSerie = ctpsSerie;
    }

   
                        
    
}
