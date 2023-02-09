package com.example.projetospringprodutos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

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
    @NotNull(message = "id não pode ser null")
    private int Id;

    @Column(name = "NOME_PRODUTO")
    @NotNull(message = "nome é obrigatório")
    @Size(min = 3, max = 100, message = "nome do produto deve conter entre 3 e 100 caracteres")
    private String nomeProduto;

    @Column(name = "DESCRICAO_PRODUTO")
    @NotNull(message = "descricao é obrigatório")
    @Size(min = 3, max = 250, message = "descrição do produto deve conter entre 3 e 400 caracteres")
    private String descricao;

    private String categoria;

    @Column(name = "FABRICANTE")
    private String fabricante;

    @Column(name = "FORNECEDOR")
    private String fornecedor;

    @Column(name = "PRECO_UNITARIO")
    @NotNull(message = "preço é obrigatório")
    @Range(min = 1)
    private double precoUnitario;

    @Column(name = "UNIDADES_ESTOQUE")
    private int UnidadesEstoque;
}