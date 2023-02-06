package com.example.projetospringB.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class funcionarioModel {
    private int id;
    private String nome;
    private String funcao;
}
