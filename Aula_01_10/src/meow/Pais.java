/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meow;

/**
 *
 * @author LAB03
 */
public class Pais extends CamposComuns{
    private int PaisID;  
    private String descricao;

   

    /**
     * @return the PaisID
     */
    public int getPaisID() {
        return PaisID;
    }

    /**
     * @param PaisID the PaisID to set
     */
    public void setPaisID(int PaisID) {
        this.PaisID = PaisID;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
