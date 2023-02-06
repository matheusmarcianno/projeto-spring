package com.example.projetospringB.repository;

import java.util.ArrayList;
import java.util.List;
import com.example.projetospringB.model.clienteModel;

public class clienteRepository {
    List<clienteModel> clientes = new ArrayList<clienteModel>();

    public clienteRepository() {
        clientes.add(new clienteModel(1, "matheus", 18, 0303));
        clientes.add(new clienteModel(2, "felipe", 22, 0505));
        clientes.add(new clienteModel(3, "thiago", 26, 0404));
        clientes.add(new clienteModel(4, "victoria", 21, 0606));
        clientes.add(new clienteModel(5, "maria", 50, 0707));

    }

    public void addCliente(clienteModel model) {
        clientes.add(model);
    }

    public List<clienteModel> getAll() {
        return clientes;
    }

    public void delete(clienteModel model) {
        clientes.remove(model);
    }

    public void update(clienteModel model) {
        for ( clienteModel c : clientes ) {
            if(c.getId() == model.getId())
                c.setNome(model.getNome());
                c.setIdade(model.getIdade());
                c.setCod_cadastro(model.getCod_cadastro());
        }
    }

    public clienteModel getById(int id) {
        for ( clienteModel c : clientes ) {
            if(c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}
