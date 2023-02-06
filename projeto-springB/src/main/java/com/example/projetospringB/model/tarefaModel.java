package com.example.projetospringB.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class tarefaModel {
    private int id;
    private int tempo;
    private String descricao;
}
