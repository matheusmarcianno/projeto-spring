package com.example.apispring.controller;

import com.example.apispring.model.ContatoModel;
import com.example.apispring.repository.ContatoRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatos")
public class ContatoController {
    @Autowired
    private ContatoRepositoy repository;

    @GetMapping("/buscar")
    public List<ContatoModel> getAll() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public ContatoModel getById(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @GetMapping("/buscarNome/{nome}")
    public List<ContatoModel> getByNome(@PathVariable String nome) {
        String nomeToUpper = nome.toUpperCase();
        return repository.findByNome(nomeToUpper);
    }

    @PostMapping("/salvar")
    public ContatoModel create(@RequestBody ContatoModel model) {
        return repository.save(model);
    }

    @PostMapping("/atualizar")
    public ContatoModel update(@RequestBody ContatoModel model) {
        return repository.save(model);
    }

    @DeleteMapping("/deletar/{id}")
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}
