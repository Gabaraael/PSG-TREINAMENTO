package com.mycompany.atividadearraylist;

import com.mycompany.atividadearraylist.FakeDB.EstoqueFakeDB;
import com.mycompany.atividadearraylist.Pojo.CategoriaPojo;
import com.mycompany.atividadearraylist.Pojo.ProdutoPojo;
import com.mycompany.atividadearraylist.Pojo.SubCategoriaPojo;
import java.util.*;

public class Imprime {

    public static void exibirCategorias() {

        EstoqueFakeDB.getCategorias().stream().forEach(cat -> {
            System.out.println("Categorias");
            System.out.println("ID: " + cat.getCategoriaID());
            System.out.println("Descricao: " + cat.getDescricao());
            System.out.println("DataInsert: " + cat.getDataInsert());

        });
    }

    public static void exibirSubCategorias(int catid) {
        EstoqueFakeDB.getSubCategorias()
                .stream()
                .filter(f -> f.getCategoriaID() == catid)
                .forEach(subCat -> {
                    System.out.println("\t-------");
                    System.out.println("\tSubCategoria");
                    System.out.println("\tID de Categoria: " + subCat.getCategoriaID());
                    System.out.println("\tID de SubCategoria: " + subCat.getSubCategoriaID());
                    System.out.println("\tDescricao: " + subCat.getDescricao());
                    System.out.println("\tDataInsert: " + subCat.getDataInsert());

                });

    }

    public static void exibirProdutos(int ProID) {
        EstoqueFakeDB.getProdutos()
                .stream()
                .filter(pro -> pro.getSubCategoriaID() == ProID)
                .forEach(prod -> {
            System.out.println("\t\t-------");
            System.out.println("\t\tProdutos");
            System.out.println("\t\tID de Categoria: " + prod.getCategoriaID());
            System.out.println("\t\tID de SubCategoria: " + prod.getSubCategoriaID());
            System.out.println("\t\tID de Produto: " + prod.getProdutoID());
            System.out.println("\t\tDescricao: " + prod.getDescricao());
            System.out.println("\t\tDataInsert: " + prod.getDataInsert());
        });

    }
}


