package com.mycompany.atividadesacocheio.DAO;

import com.mycompany.atividadesacocheio.FakeDB.EmpresaFakeDB;
import com.mycompany.atividadesacocheio.pojo.*;
import java.util.ArrayList;

public class FuncionarioDao {
    //CRUD

    public void create(FuncionarioPojo pojo) {
        EmpresaFakeDB.getFuncionarios().add(pojo);
    }

    public FuncionarioPojo read(int categoriaID) {
        return search(categoriaID);
    }

    public ArrayList<FuncionarioPojo> readAll() {
        return EmpresaFakeDB.getFuncionarios();
    }

    public void update(FuncionarioPojo pojo) {
        FuncionarioPojo busca = search(pojo.getFuncionarioID());
        EmpresaFakeDB.getFuncionarios().remove(busca);
        EmpresaFakeDB.getFuncionarios().add(pojo);

    }

    public void delete(FuncionarioPojo pojo) {
        FuncionarioPojo busca = search(pojo.getFuncionarioID());
        EmpresaFakeDB.getFuncionarios().remove(busca);
    }

    private FuncionarioPojo search(int id) {
        return EmpresaFakeDB.getFuncionarios()
                .stream()
                .filter(c -> c.getFuncionarioID()== id)
                .findFirst()
                .orElse(null);

    }
}
