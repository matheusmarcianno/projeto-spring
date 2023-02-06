package com.example.projetospringB.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class produtoModel {
    private int id;
    private String nome;
    private double preco;

}
