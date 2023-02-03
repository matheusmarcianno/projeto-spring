package com.example.demo.controller;

import com.example.demo.model.FornecedorModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class FornecedorController {

    @GetMapping("/fornecedor")
    public ResponseEntity<List<FornecedorModel>> get() {
        List<FornecedorModel> list = new ArrayList<>();

        var fornecedor = new FornecedorModel(1, "Teste", "789456123");
        var fornecedor1 = new FornecedorModel(2, "Maksa", "1235746890");

        list.add(fornecedor);
        list.add(fornecedor1);

        return ResponseEntity.ok(list);
    }
}
