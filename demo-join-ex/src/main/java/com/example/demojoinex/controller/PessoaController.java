package com.example.demojoinex.controller;

import com.example.demojoinex.model.PessoaModel;
import com.example.demojoinex.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

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

    @PostMapping("/atualizar")
    public PessoaModel update(@RequestBody PessoaModel model){
        return repository.save(model);
    }

    @PostMapping("/excluir/{id}")
    public void delete(@PathVariable int id){
        repository.deleteById(id);
    }
}
