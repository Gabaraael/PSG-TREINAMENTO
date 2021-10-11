package com.mycompany.atividadesacocheio.Principal;


import com.mycompany.atividadesacocheio.Service.FuncionarioService;
import java.text.ParseException;


public class Principal {

    public static void main(String Args[]) throws ParseException {
        FuncionarioService fun = new FuncionarioService();
            fun.exibirMenu();

    }
}
