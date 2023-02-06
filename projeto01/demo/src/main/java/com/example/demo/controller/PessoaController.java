package com.example.demo.controller;

import com.example.demo.model.PessoaModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PessoaController {
    @GetMapping("/pessoa")
    public ResponseEntity<List<PessoaModel>> pessoa() {
        List<PessoaModel> pss = new ArrayList<>();

        PessoaModel pessoa  = new PessoaModel(1, "Matheus", 18);
        PessoaModel pessoa1  = new PessoaModel(2, "Felipe", 22);
        PessoaModel pessoa2  = new PessoaModel(3, "Victoria", 21);

        pss.add(pessoa);
        pss.add(pessoa1);
        pss.add(pessoa2);


        return ResponseEntity.ok(pss);
    }

    @GetMapping("/robo")
    public String robo() {
        return "Olá, eu sou robo";
    }

}
