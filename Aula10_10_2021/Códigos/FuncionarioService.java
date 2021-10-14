package com.mycompany.atividadesacocheio.Service;

import com.mycompany.atividadesacocheio.DAO.FuncionarioDao;

import com.mycompany.atividadesacocheio.pojo.*;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.Scanner;



public class FuncionarioService {

    private Scanner sc;

    FuncionarioDao dao = new FuncionarioDao();

    SimpleDateFormat formato;

    public FuncionarioService() {
        this.sc = new Scanner(System.in);
    }

    public void exibirMenu() {
        boolean sair = false;
        printMenu();

        int op = sc.nextInt();
        do {
            switch (op) {
                case 1:
                    //Insert
                    this.printMenuInserir();
                    printMenu();
                    op = sc.nextInt();
                    break;
                case 2:
                    //ReadAll
                    this.printMenuListar();
                    printMenu();
                    op = sc.nextInt();

                    break;
                case 3:
                    //ReadOne
                    this.printMenuDetalhar();
                    printMenu();
                    op = sc.nextInt();
                    break;
                case 4:
                    //Update
                    printMenuAlterar();
                    printMenu();
                    op = sc.nextInt();
                    break;
                case 5:
                    //Delete
                    PrintMenuDeletar();
                    printMenu();
                    op = sc.nextInt();
                    break;
                case 6:
                    //Exit
                    sair = true;
                    break;
                default:

                    printMenu();
                    System.out.println("Opção não disponível");
                    op = sc.nextInt();
                    break;

            }
        } while (sair != true);

    }

    private void printMenu() {
        System.out.println("##--Menu Funcionario - CRUD--##");
        System.out.println("-------------------------------");
        System.out.println("| Opção 1 - INSERIR    |");
        System.out.println("| Opção 2 - LISTAR     |");
        System.out.println("| Opção 3 - DETALHAR   |");
        System.out.println("| Opção 4 - ALTERAR    |");
        System.out.println("| Opção 5 - EXCLUIR    |");
        System.out.println("| Opção 6 - SAIR       |");
        System.out.println("-------------------------------");
        System.out.println("Digite uma opção");
    }

    private void printMenuListar() {
        System.out.println("##--Menu Funcionario - LISTAR--##");
        for (FuncionarioPojo f : this.dao.readAll()) {
            System.out.println("-------------------------------");

            System.out.println("|Funcionario ID: " + f.getFuncionarioID());
            System.out.println("|Chave ID: " + f.getChaveID());
            System.out.println("|Nome: " + f.getNome());
            System.out.println("|Sobrenome: " + f.getSobreNome());
            System.out.println("|Sexo: " + f.getSexo());
            System.out.println("|Data de Nascimento: " + f.getDataNascimento());
            System.out.println("|Email: " + f.getEmail());
            System.out.println("|CTPS: " + f.getCtps());
            System.out.println("|CTPS num: " + f.getCtpsNum());
            System.out.println("|CTPS série: " + f.getCtpsSerie());
            System.out.println("|PaisID : " + f.getPaisID());
            System.out.println("|Data De Admissao: " + f.getDataDeAdmissao());
            System.out.println("|Data De Inserção: " + f.getDataInsert());

        }

    }

    private void printMenuInserir() {
        formato = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        FuncionarioPojo f = new FuncionarioPojo();
        System.out.println("##--Menu Funcionario - INSERIR--##");
        System.out.println("-------------------------------");
        System.out.println("|Funcionario ID:        ");
        int id = sc.nextInt();
        f.setFuncionarioID(id);
        System.out.println("|Chave ID:        ");
        f.setChaveID(sc.nextLong());
        System.out.println("|Nome:        ");
        f.setNome(sc.next());
        System.out.println("|Sobrenome:        ");
        f.setSobreNome(sc.next());
        System.out.println("|Sexo:        ");
        f.setSexo(sc.next().charAt(0));
        System.out.println("|Data de Nascimento:        ");
        try {
            f.setDataNascimento(formato.parse(sc.next()));
        } catch (ParseException ex) {
            System.out.println("Erro na conversão de data, utilize dia/mês/ano");
        }
        System.out.println("|Email:        ");
        f.setEmail(sc.next());
        System.out.println("|CTPS:        ");
        f.setCtps(sc.next());
        System.out.println("|CTPS num:        ");
        f.setCtpsNum(sc.nextLong());
        System.out.println("|CTPS série:        ");
        f.setCtpsSerie(sc.nextInt());
        System.out.println("|PaisID :        ");
        f.setPaisID(sc.nextInt());
        System.out.println("|Data De Admissao:        ");
        try {
            f.setDataDeAdmissao(formato.parse(sc.next()));
        } catch (ParseException ex) {
            System.out.println("Erro na conversão de data, utilize dia/mês/ano");
        }
        System.out.println("|Data De Inserção:        ");
        f.setDataInsert(date);
        System.out.println("-------------------------------");
        this.dao.create(f);

        if (this.dao.read(id) != null) {
            System.out.println("Funcionario Adicionada.");
            System.out.println("-------------------------------");
        } else {
            System.out.println("Erro ao adicionar a Funcionario");
        }

    }

    private void printMenuDetalhar() {
        System.out.println("##--Menu Funcionario - DETALHAR--##");
        System.out.println("Digite o ID do Funcionario");
        int id = this.sc.nextInt();
        FuncionarioPojo f = this.dao.read(id);
        if (f == null) {
            System.out.println("Funcionario não existe");
        } else {
            System.out.println("-------------------------------");
            System.out.println("|Funcionario ID: " + f.getFuncionarioID());
            System.out.println("|Chave ID: " + f.getChaveID());
            System.out.println("|Nome: " + f.getNome());
            System.out.println("|Sobrenome: " + f.getSobreNome());
            System.out.println("|Sexo: " + f.getSexo());
            System.out.println("|Data de Nascimento: " + f.getDataNascimento());
            System.out.println("|Email: " + f.getEmail());
            System.out.println("|CTPS: " + f.getCtps());
            System.out.println("|CTPS num: " + f.getCtpsNum());
            System.out.println("|CTPS série: " + f.getCtpsSerie());
            System.out.println("|PaisID : " + f.getPaisID());
            System.out.println("|Data De Admissao: " + f.getDataDeAdmissao());
            System.out.println("|Data De Inserção: " + f.getDataInsert());
        }

    }

    private void printMenuAlterar() {
        System.out.println("##--Menu Funcionario - ALTERAR--##");
        System.out.println("Digite o ID do Funcionario");
        formato = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        int op = this.sc.nextInt();
        FuncionarioPojo f = this.dao.read(op);
        if (f == null) {
            System.out.println("Funcionario não existe");
        } else {           
            System.out.println("|Digite o novo Nome: ");
            f.setNome(sc.next());
            System.out.println("|Digite o novo Sobrenome: ");
            f.setSobreNome(sc.next());
            System.out.println("|Digite o novo Sexo: ");
            f.setSexo(sc.next().charAt(0));
            System.out.println("|Digite a nova Data de Nascimento: ");
            try {
                f.setDataNascimento(formato.parse(sc.next()));
            } catch (ParseException ex) {
                System.out.println("Erro na conversão de data, utilize dia/mês/ano");
            }
            System.out.println("|Digite o novo Email: ");
            f.setEmail(sc.next());
            System.out.println("|Digite o novo CTPS: ");
            f.setCtps(sc.next());
            System.out.println("|Digite o novo CTPS num: ");
            f.setCtpsNum(sc.nextLong());
            System.out.println("|Digite o novo CTPS série: ");
            f.setCtpsSerie(sc.nextInt());
            System.out.println("|Digite o novo PaisID : ");
            f.setPaisID(sc.nextInt());
            System.out.println("|Digite a nova Data De Admissao: ");
            try {
                f.setDataDeAdmissao(formato.parse(sc.next()));
            } catch (ParseException ex) {
                System.out.println("Erro na conversão de data, utilize dia/mês/ano");
            }
            f.setDataInsert(date);
            dao.update(f);
                    

        }

    }

    private void PrintMenuDeletar() {
        System.out.println("##--Menu Funcionario - DELETAR--##");
        System.out.println("Informe o ID do Funcionario");                  
        FuncionarioPojo f = dao.read(sc.nextInt());
        if(f != null){
            dao.delete(f);
            System.out.println("Deletado com sucesso"); 
        }else{
            System.out.println("Funcionário não encontrado");
        }
        
        

        
    }
}
