package com.example.projetospringB.repository;


import com.example.projetospringB.model.contatoModel;
import com.example.projetospringB.model.tarefaModel;

import java.util.ArrayList;
import java.util.List;

public class tarefaRepository {
    List<tarefaModel> tarefas = new ArrayList<tarefaModel>();

    public tarefaRepository() {
        tarefas.add(new tarefaModel(1, 20, "tsadysva"));
        tarefas.add(new tarefaModel(2, 10, "sdadsad"));
        tarefas.add(new tarefaModel(3, 18, "ewfewf"));
        tarefas.add(new tarefaModel(4, 25, "TEdgfrsegrwSTE"));
        tarefas.add(new tarefaModel(5, 50, "efwefwefw"));
    }

    public void add(tarefaModel model) {
        tarefas.add(model);
    }

    public List<tarefaModel> getAll() {
        return tarefas;
    }

    public void delete(tarefaModel model) {
        tarefas.remove(model);
    }

    public void update(tarefaModel model) {
        for ( tarefaModel c : tarefas ) {
            if(c.getId() == model.getId())
                c.setTempo(model.getTempo());
            c.setDescricao(model.getDescricao());
        }
    }

    public tarefaModel getById(int id) {
        for ( tarefaModel c : tarefas ) {
            if(c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}
