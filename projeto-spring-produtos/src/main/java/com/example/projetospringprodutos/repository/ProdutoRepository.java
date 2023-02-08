package com.example.projetospringprodutos.repository;

import com.example.projetospringprodutos.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {
    @Query(value = "SELECT * FROM MATHEUS_PRODUTOS WHERE UNIDADES_ESTOQUE > 0", nativeQuery = true)
    public List<ProdutoModel> findStockGreaterThanZero();

	/*
	Buscar por nome_produto usando o like do sql e ignorando o case usando o UPPER(Criar um get separado);
	Buscar por descricao usando o like do sql e ignorando o case usando o UPPER(Criar um get separado);
	Buscar por categoria(Criar um get separado);
	Buscar por fornecedor(Criar um get separado);
	Buscar por fabricante(Criar um get separado);
	 */

    @Query(value = "SELECT * FROM MATHEUS_PRODUTOS WHERE DESCRICAO_PRODUTO LIKE %?1% ", nativeQuery = true)
    public List<ProdutoModel> findLikeDescription(String descricao);

    @Query(value = "SELECT * FROM WHERE NOME_PRODUTO LIKE %?1%", nativeQuery = true)
    public List<ProdutoModel> findLikeName(String nome);

    public List<ProdutoModel> findByCategoria(String categoria);

    public List<ProdutoModel> findByFornecedor(String fornecedor);

    public List<ProdutoModel> findByFabricante(String fabricante);
}
