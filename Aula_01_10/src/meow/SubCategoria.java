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
public class SubCategoria extends CamposComuns{
    private int SubCategoriaID;
    private int CategoriaID;
    private Categoria categoria;
    
    
      public SubCategoria(Categoria categoria){
        this.categoria = categoria;    
    }
    /**
     * @return the SubCategoriaID
     */
    public int getSubCategoriaID() {
        return SubCategoriaID;
    }

    /**
     * @param SubCategoriaID the SubCategoriaID to set
     */
    public void setSubCategoriaID(int SubCategoriaID) {
        this.SubCategoriaID = SubCategoriaID;
    }

    /**
     * @return the CategoriaID
     */
    public int getCategoriaID() {
        return CategoriaID;
    }

    /**
     * @param CategoriaID the CategoriaID to set
     */
    public void setCategoriaID(int CategoriaID) {
        this.CategoriaID = CategoriaID;
    }
        
    
    
}
