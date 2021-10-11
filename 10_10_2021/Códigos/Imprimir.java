package com.mycompany.atividadesacocheio.Principal;

import com.mycompany.atividadesacocheio.FakeDB.EmpresaFakeDB;

public class Imprimir {

    public static void exibirFuncionarios() {
        System.out.println("Funcionarios:");
        EmpresaFakeDB.getFuncionarios().forEach(f -> {      
            System.out.println("----------------------------");
            System.out.println("|Funcionario ID: "+f.getFuncionarioID());
            System.out.println("|Chave ID: "+f.getChaveID());
            System.out.println("|Nome: "+f.getNome());
            System.out.println("|Sobrenome: "+f.getSobreNome());
            System.out.println("|Sexo: "+f.getSexo());
            System.out.println("|Data de Nascimento: "+f.getDataNascimento());
            System.out.println("|Email: "+f.getEmail());
            System.out.println("|CTPS: "+f.getCtps());
            System.out.println("|CTPS num: "+f.getCtpsNum());
            System.out.println("|CTPS série: "+f.getCtpsSerie());
            System.out.println("|PaisID : "+f.getPaisID());
            System.out.println("|Data De Admissao: "+f.getDataDeAdmissao());
            System.out.println("|Data De Inserção: "+f.getDataInsert());
            
        });
    }
   

   

    public Imprimir() {
    }

}
