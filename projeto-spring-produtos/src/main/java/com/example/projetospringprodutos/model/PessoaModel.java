package com.example.projetospringprodutos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name = "M_PESSOAS")
public class PessoaModel {
    @Id
    @Column(name = "ID")
    @NotNull(message = "Id é obrigatório")
    private int id;

    @Column(name = "NOME")
    @NotNull(message = "Nome é obrigatório")
    @Size(min = 3, max = 100)
    private String nome;

    @Column(name = "EMAIL")
    @NotNull(message = "Email é obrigatório")
    @Email(message = "Email inválido")
    private String email;

    @Column(name = "DATA_NASCIMENTO")
    @NotNull(message = "Data de nascimento é obrigatório")
    private Date dataNascimento;
}
