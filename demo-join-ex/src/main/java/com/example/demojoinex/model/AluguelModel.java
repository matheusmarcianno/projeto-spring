package com.example.demojoinex.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name = "ALUGUEL")
public class AluguelModel {

    @Id
    @Column(name = "ID")
    private int id;

    @OneToOne()
    @JoinColumn(name = "ID_LIVRO", referencedColumnName = "ID")
    public LivroModel livro;

    @Column(name = "DATA_ALUGUEL")
    private Date dataAluguel;
}
