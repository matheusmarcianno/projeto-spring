package com.example.projetospringB.repository;

import com.example.projetospringB.model.clienteModel;
import com.example.projetospringB.model.contatoModel;

import java.util.ArrayList;
import java.util.List;

public class contatoRepository {

    List<contatoModel> contatos = new ArrayList<contatoModel>();

    public contatoRepository() {
        contatos.add(new contatoModel(1, "matheus@gmail.com", "047996886829"));
        contatos.add(new contatoModel(2, "felipe@gmail.com", "047996886829"));
        contatos.add(new contatoModel(3, "thiago@gmail.com", "047996886829"));
        contatos.add(new contatoModel(4, "victoria@gmail.com", "047996886829"));
        contatos.add(new contatoModel(5, "maria@gmail.com", "047996886829"));
    }

    public void addCliente(contatoModel model) {
        contatos.add(model);
    }

    public List<contatoModel> getAll() {
        return contatos;
    }

    public void delete(contatoModel model) {
        contatos.remove(model);
    }

    public void update(contatoModel model) {
        for ( contatoModel c : contatos ) {
            if(c.getId() == model.getId())
                c.setEmail(model.getEmail());
            c.setNumeroTelefone(model.getNumeroTelefone());
        }
    }

    public contatoModel getById(int id) {
        for ( contatoModel c : contatos ) {
            if(c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}
