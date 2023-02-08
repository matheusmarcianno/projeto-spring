package com.example.projetospringprodutos.controller;

import com.example.projetospringprodutos.model.ProdutoModel;
import com.example.projetospringprodutos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/buscar")
    public List<ProdutoModel> getAll() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public ProdutoModel getById(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @GetMapping("/bucarEstoquePositivo")
    public List<ProdutoModel> findStock() {
        return  repository.findStockGreaterThanZero();
    }

    @GetMapping("/buscarComoDescricao/{descricao}")
    public List<ProdutoModel> findLikeDescription(@PathVariable String descricao) {
        var strToUpper = descricao.toUpperCase();
        return repository.findLikeDescription(strToUpper);
    }

    @GetMapping("/buscarComoNome/{nome}")
    public List<ProdutoModel> findLikeName(@PathVariable String nome) {
        var strToUpper = nome.toUpperCase();
        return repository.findLikeDescription(strToUpper);
    }

    @GetMapping("/buscarPelaCategoria/{categoria}")
    public List<ProdutoModel> findByCategoria(@PathVariable String categoria) {
        var strToUpper = categoria.toUpperCase();
        return repository.findByCategoria(strToUpper);
    }

    @GetMapping("/buscarPeloFornecedor/{fornecedor}")
    public List<ProdutoModel> findByFornecedor(@PathVariable String fornecedor) {
        var strToUpper = fornecedor.toUpperCase();
        return repository.findByFornecedor(strToUpper);
    }

    @GetMapping("/buscarPeloFabricante/{fabricante}")
    public List<ProdutoModel> findByFabricante(@PathVariable String fabricante) {
        var strToUpper = fabricante.toUpperCase();
        return repository.findByFabricante(strToUpper);
    }

    @PostMapping("/salvar")
    public ProdutoModel create(@RequestBody ProdutoModel model) {
       return repository.save(model);
    }

    @PutMapping("/atualizar")
    public ProdutoModel update(@RequestBody ProdutoModel model) {
        return repository.save(model);
    }

    @DeleteMapping("/excluir/{id}")
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}

