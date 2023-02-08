package com.example.apispring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/*
CREATE TABLE m_contatos (
  id_contato NUMBER PRIMARY KEY,
  nome VARCHAR2(50) NOT NULL,
  email VARCHAR2(100) NOT NULL,
  telefone VARCHAR2(15),
  endereco VARCHAR2(200)
);
 */

@Entity
@Table(name = "M_CONTATOS")
@Data
public class ContatoModel {
    @Id
    @Column(name = "ID_CONTATO")
    private int id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "ENDERECO")
    private String endereco;
}
