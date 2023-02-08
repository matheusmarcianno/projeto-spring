package com.example.apispring.controller;

import com.example.apispring.model.LivroModel;
import com.example.apispring.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroRepository repository;

    @GetMapping("/buscar")
    public List<LivroModel> getAll() {
        return repository.findAll();
    }

    @GetMapping("/buscsar/{id}")
    public LivroModel getById(int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/salvar")
    public LivroModel save(@RequestBody LivroModel livro) {
        return repository.save(livro);
    }

    @PutMapping("/atualizar")
    public LivroModel update(@RequestBody LivroModel livro) {
        return repository.save(livro);
    }

    @DeleteMapping("/excluir/{id}")
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}
