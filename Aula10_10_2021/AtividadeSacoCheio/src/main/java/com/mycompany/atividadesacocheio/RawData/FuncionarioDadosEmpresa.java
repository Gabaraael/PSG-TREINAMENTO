package com.mycompany.atividadesacocheio.RawData;


import java.util.Date;

public class FuncionarioDadosEmpresa {

    private long chaveID;

    private String nome;

    private String sobreNome;

    private Date dataDeAdmissao;

    private String ctps;

    private long ctpsNum;

    private int ctpsSerie;

    public long getChaveID() {
        return chaveID;
    }

    public void setChaveID(long  chaveID) {
        this.chaveID = chaveID;
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

    public Date getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(Date dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
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
}
