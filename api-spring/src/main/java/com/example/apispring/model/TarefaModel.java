package com.example.apispring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Date;

/*
CREATE TABLE tarefas (
  id_tarefa NUMBER PRIMARY KEY,
  nome_tarefa VARCHAR2(50) NOT NULL,
  descricao_tarefa VARCHAR2(200),
  data_inicio DATE NOT NULL,
  status VARCHAR2(20) NOT NULL,
  prioridade NUMBER(1) NOT NULL
);
 */
@Entity
@Table(name = "M_TAREFAS")
@Data
public class TarefaModel {
    @Id
    @Column(name = "ID_TAREFA")
    private int id;

    @Column(name = "NOME_TAREFA")
    private String nome;

    @Column(name = "DESCRICAO_TAREFA")
    private String descricao;

    @Column(name = "DATA_INICIO")
    private Date dataInicio;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "PRIORIDADE")
    private int prioridade;
}
