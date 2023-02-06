package com.example.conexaobanco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Columns;

import java.sql.Date;
@Data
@Table(name = "matheus_usuarios")
@Entity
public class usuarioModel {
    @Id
    @Column(name = "Id")
    private int Id;

    @Column(name = "Cpf")
    private String Cpf;

    @Column(name = "Sexo")
    private String Sexo;

    @Column(name = "Nome")
    private String Nome;

    @Column(name = "Data_de_Nascimento")
    private Date DataNascimento;

    @Column(name = "Tipo_Sanguineo")
    private String TipoSanguineo;

    @Column(name = "Email")
    private String Email;
 }
