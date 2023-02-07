package com.example.projetofilmes.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class FilmeModel {
    private int id;
    private String name;
    private String description;
    private Date releaseDate;
    private double numberSales;
    private String countryOrigin;


}
