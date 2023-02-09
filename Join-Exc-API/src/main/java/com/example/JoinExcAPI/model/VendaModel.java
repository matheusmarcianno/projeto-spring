package com.example.JoinExcAPI.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "VENDAS_LUCAS")
public class VendaModel {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "NOME_COMPRADOR")
    private String nomeComprador;

    @ManyToOne
    @JoinColumn(name = "ID_PESSOA", referencedColumnName = "ID")
    private PessoaModel pessoa;

}
