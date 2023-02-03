package com.example.demo.controller;

import com.example.demo.model.PessoaModel;
import com.example.demo.model.ProdutoModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProdutoController {

    @GetMapping("/produto")
    public ResponseEntity<List<ProdutoModel>> get() {
        List<ProdutoModel> list = new ArrayList<>();

        var produto = new ProdutoModel(1, "televisão", 1000);
        var produto2 = new ProdutoModel(2, "carro", 100000);
        var produto3 = new ProdutoModel(3, "celular", 5000);

        list.add(produto);
        list.add(produto2);
        list.add(produto3);

        return ResponseEntity.ok(list);
    }
}
