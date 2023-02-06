package com.example.projetospringB.repository;

import com.example.projetospringB.model.funcionarioModel;

import java.util.ArrayList;
import java.util.List;

public class funcionarioRepository {
    List<funcionarioModel> funcionarios = new ArrayList<funcionarioModel>();

    public funcionarioRepository(){
        funcionarios.add(new funcionarioModel(1, "Matheus", "adm"));
        funcionarios.add(new funcionarioModel(2, "Felipe", "dev"));
        funcionarios.add(new funcionarioModel(3, "Victoria", "gerente de marketing"));
        funcionarios.add(new funcionarioModel(4, "João", "gerente"));
        funcionarios.add(new funcionarioModel(5, "Maria", "CEO"));
    }

    public List<funcionarioModel> getAll() {
        return funcionarios;
    }
    public funcionarioModel getById(int id) {
        for (funcionarioModel f : funcionarios ) {
            if(f.getId() == id) {
                return f;
            }
        }
        return null;
    }

    public void delete(funcionarioModel model) {
        funcionarios.remove(model);
    }

    public void create(funcionarioModel model) {
        funcionarios.add(model);
    }

    public void update(funcionarioModel model) {
        for (funcionarioModel f : funcionarios) {
            if(f.getId() == model.getId()) {
                f.setFuncao(model.getFuncao());
                f.setNome(model.getNome());
            }
        }
    }
}
