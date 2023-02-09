package com.example.demojoinex.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "PONTO_MATHEUS")
public class PontoModel {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "DATA_ENTRADA")
    private String dataEntrada;

    @Column(name = "DATA_SAIDA")
    private String dataSaida;
    @ManyToOne
    @JoinColumn(name = "FK_PESSOA", referencedColumnName = "ID")
    private PessoaModel pessoa;
}
