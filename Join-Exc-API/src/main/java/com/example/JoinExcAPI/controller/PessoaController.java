package com.example.JoinExcAPI.controller;

import com.example.JoinExcAPI.model.PessoaModel;
import com.example.JoinExcAPI.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @GetMapping("/buscar")
    public List<PessoaModel> findAll() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public PessoaModel findById(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/salvar")
    public PessoaModel save(@RequestBody PessoaModel pessoa) {
        return repository.save(pessoa);
    }

    @PutMapping("/atualizar")
    public PessoaModel atualizar(@RequestBody PessoaModel pessoa) {
        return repository.save(pessoa);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable int id) {
        repository.deleteById(id);
    }
}
