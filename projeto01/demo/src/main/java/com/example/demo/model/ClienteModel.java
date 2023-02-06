package com.example.demo.model;

import com.example.demo.controller.ClienteController;
import lombok.Data;

@Data
public class ClienteModel {
    private int id;
    private String nome;
    private String cpf;

    public ClienteModel() {}

    public ClienteModel(int id, String nome, String cpf) {
        this.id = id;
        this.cpf =  cpf;
        this.nome = nome;
    }
}
