package com.example.projetospringB.repository;


import com.example.projetospringB.model.produtoModel;

import java.util.ArrayList;
import java.util.List;

public class produtoRepository {
    List<produtoModel> produtos = new ArrayList<produtoModel>();

    public produtoRepository() {
        produtos.add(new produtoModel(1, "matheus", 1000));
        produtos.add(new produtoModel(2, "felipe", 1000));
        produtos.add(new produtoModel(3, "thiago", 1000));
        produtos.add(new produtoModel(4, "victoria", 1000));
        produtos.add(new produtoModel(5, "maria", 1000));
    }

    public void add(produtoModel model) {
        produtos.add(model);
    }

    public List<produtoModel> getAll() {
        return produtos;
    }

    public void delete(produtoModel model) {
        produtos.remove(model);
    }

    public void update(produtoModel model) {
        for ( produtoModel c : produtos ) {
            if(c.getId() == model.getId())
                c.setNome(model.getNome());
            c.setPreco(model.getPreco());
        }
    }

    public produtoModel getById(int id) {
        for ( produtoModel c : produtos ) {
            if(c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}
