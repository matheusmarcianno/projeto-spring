package com.example.demo.model;

import com.example.demo.controller.ProdutoController;
import lombok.Data;

@Data
public class ProdutoModel {
    private int id;
    private String nome;
    private double preco;

    public ProdutoModel(){}

    public ProdutoModel(int id, String nome, int preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
}
