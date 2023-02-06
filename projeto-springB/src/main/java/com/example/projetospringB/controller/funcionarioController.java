package com.example.projetospringB.controller;

import com.example.projetospringB.model.clienteModel;
import com.example.projetospringB.model.funcionarioModel;
import com.example.projetospringB.repository.clienteRepository;
import com.example.projetospringB.repository.funcionarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("funcionario")
public class funcionarioController {
    private funcionarioRepository repository = new funcionarioRepository();

    @GetMapping("/search")
    public ResponseEntity<List<funcionarioModel>> get() {
        return ResponseEntity.ok(repository.getAll());
    }

    @PostMapping("/addFuncionario")
    public void addFuncionario(@RequestBody funcionarioModel model) {
        repository.create(model);
    }

    @DeleteMapping("/deleteFuncionario")
    public void delete(@RequestBody funcionarioModel model) {
        repository.delete(model);
    }

    @PutMapping("/updateFuncionario")
    public void update(@RequestBody funcionarioModel model) {
        repository.update(model);
    }

    @GetMapping("search/{id}")
    public ResponseEntity<funcionarioModel> getById(@PathVariable int id) {
        return ResponseEntity.ok(repository.getById(id));
    }
}