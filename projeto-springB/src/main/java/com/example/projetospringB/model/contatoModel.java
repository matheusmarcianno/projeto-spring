package com.example.projetospringB.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class contatoModel {
    private int id;
    private String Email;
    private String numeroTelefone;
}
