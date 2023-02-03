package com.example.demo.controller;

import com.example.demo.model.FuncionarioModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FuncionarioController {

    @GetMapping("/funcionario")
    public ResponseEntity<List<FuncionarioModel>> get() {
        List<FuncionarioModel> list = new ArrayList<>();

        var funcionario = new FuncionarioModel(1, "Teste", "12345678900");
        var funcionario1 = new FuncionarioModel(2, "KSjdka", "519468265400");

        list.add(funcionario);
        list.add(funcionario1);

        return ResponseEntity.ok(list);
    }
}
