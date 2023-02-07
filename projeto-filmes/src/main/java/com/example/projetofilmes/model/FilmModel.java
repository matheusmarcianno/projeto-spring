package com.example.projetofilmes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.sql.Date;


@Table(name = "M_FILMES")
@Entity
@Data
public class FilmModel {
    @Id
    private int id;

    @Column(name = "Nome")
    private String name;

    @Column(name = "Descricao")
    private String description;

    @Column(name = "Data_Lancamento")
    private Date releaseDate;

    @Column(name = "Quantidade_Venda")
    private float numberSales;

    @Column(name = "Pais_Origem")
    private String originCountry;
}
