package com.mycompany.atividadearraylist;

import com.mycompany.atividadearraylist.FakeDB.EstoqueFakeDB;
import com.mycompany.atividadearraylist.Pojo.CategoriaPojo;
import com.mycompany.atividadearraylist.Pojo.ProdutoPojo;
import com.mycompany.atividadearraylist.Pojo.SubCategoriaPojo;
import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);        
        Imprime.exibirCategorias();
        System.out.println("Qual categoria desejas exibir SubCategorias?");        
        Imprime.exibirSubCategorias(sc.nextInt());
        
        System.out.println("Qual Subcategoria desejas exibir os produtos?");
        Imprime.exibirProdutos(sc.nextInt());
       
}
}
