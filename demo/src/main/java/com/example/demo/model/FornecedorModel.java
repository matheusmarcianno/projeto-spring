package com.example.demo.model;

public class FornecedorModel {
    private int id;
    private String nome;
    String cnpj;

    public FornecedorModel() {}

    public FornecedorModel(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }
}
