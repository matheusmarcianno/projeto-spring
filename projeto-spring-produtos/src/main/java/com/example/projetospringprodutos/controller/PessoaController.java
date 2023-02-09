package com.example.projetospringprodutos.controller;

import com.example.projetospringprodutos.model.PessoaModel;
import com.example.projetospringprodutos.repository.PessoaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @GetMapping("/buscar")
    public List<PessoaModel> findAll(){
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public PessoaModel findById(@PathVariable int id){
        return repository.findById(id).get();
    }

    @PostMapping("/salvar")
    public PessoaModel save(@RequestBody PessoaModel model){
        return repository.save(model);
    }

    @PutMapping("/atualizar")
    public PessoaModel update(@RequestBody @Validated PessoaModel pessoa) {
            return repository.save(pessoa);
    }

    @DeleteMapping("/excluir/{id}")
    public void delete(@PathVariable int id){
        repository.deleteById(id);
    }
}
