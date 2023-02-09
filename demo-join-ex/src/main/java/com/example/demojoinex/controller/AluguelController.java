package com.example.demojoinex.controller;

import com.example.demojoinex.model.AluguelModel;
import com.example.demojoinex.model.LivroModel;
import com.example.demojoinex.repository.AluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alugueis")
public class AluguelController {
    @Autowired
    private AluguelRepository repository;

    @GetMapping("buscar")
    public List<AluguelModel> findAll(){
        return repository.findAll();
    }

    @GetMapping("buscar/{id}")
    public AluguelModel findById(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/salvar")
    public AluguelModel save(@RequestBody AluguelModel livro) {
        return repository.save(livro);
    }

    @PutMapping("/atualizar")
    public AluguelModel update(@RequestBody AluguelModel livro) {
        return repository.save(livro);
    }

    @DeleteMapping("/excluir/{id}")
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}
