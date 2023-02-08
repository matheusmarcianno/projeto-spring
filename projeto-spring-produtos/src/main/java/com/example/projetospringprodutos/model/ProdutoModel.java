package com.example.projetospringprodutos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "MATHEUS_PRODUTOS")
public class ProdutoModel {

    /*
    O preco deve ser superior a 0;
    O produto deve ter no minimo 4 caracteres e no maximo 100;
    A Categoria nao pode estar vazia;
    nao pode cadastrar produto com unidades_estoque menor que 1;
     */

    @Id
    @Column(name = "ID_PRODUTO")
    private int Id;

    @Column(name = "NOME_PRODUTO")
    private String nomeProduto;

    @Column(name = "DESCRICAO_PRODUTO")
    private String descricao;

    @Column(name = "CATEGORIA")
    private String categoria;

    @Column(name = "FABRICANTE")
    private String fabricante;

    @Column(name = "FORNECEDOR")
    private String fornecedor;

    @Column(name = "PRECO_UNITARIO")
    private double precoUnitario;

    @Column(name = "UNIDADES_ESTOQUE")
    private int UnidadesEstoque;
}
