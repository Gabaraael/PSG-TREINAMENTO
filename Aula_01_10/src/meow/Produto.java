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
public class Produto extends CamposComuns{
    private int ProdutoID;
    private int SubcategoriaID;
    private int categoriaID;
    private SubCategoria subcategoria;

 
     public Produto(SubCategoria subcategoria){
        this.subcategoria = subcategoria;    
}
        /**
     * @return the ProdutoID
     */
    public int getProdutoID() {
        return ProdutoID;
    }

    /**
     * @param ProdutoID the ProdutoID to set
     */
    public void setProdutoID(int ProdutoID) {
        this.ProdutoID = ProdutoID;
    }

    /**
     * @return the SubcategoriaID
     */
    public int getSubcategoriaID() {
        return SubcategoriaID;
    }

    /**
     * @param SubcategoriaID the SubcategoriaID to set
     */
    public void setSubcategoriaID(int SubcategoriaID) {
        this.SubcategoriaID = SubcategoriaID;
    }

    /**
     * @return the categoriaID
     */
    public int getCategoriaID() {
        return categoriaID;
    }

    /**
     * @param categoriaID the categoriaID to set
     */
    public void setCategoriaID(int categoriaID) {
        this.categoriaID = categoriaID;
    }
    
    
    
    
}
