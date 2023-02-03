package com.example.demo.model;

import lombok.Data;

@Data
public class PessoaModel {
     int id;
     String nome;
     int idade;

    public PessoaModel() {}

    public PessoaModel(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
}
