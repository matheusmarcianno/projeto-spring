package com.example.projetospringB.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class clienteModel {
    private int id;
    private String nome;
    private int idade;
    private int cod_cadastro;

}
