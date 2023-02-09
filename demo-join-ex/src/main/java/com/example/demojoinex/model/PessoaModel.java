package com.example.demojoinex.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "PESSOA_MATHEUS")
public class PessoaModel {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "IDADE")
    private int idade;

    @Column(name = "SEXO")
    private char sexo;
}
