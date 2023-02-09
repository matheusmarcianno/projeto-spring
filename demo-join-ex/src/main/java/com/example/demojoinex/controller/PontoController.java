package com.example.demojoinex.controller;

import com.example.demojoinex.model.PontoModel;
import com.example.demojoinex.repository.PontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ponto")
public class PontoController {
    @Autowired
    private PontoRepository repository;

    @GetMapping("/buscar")
    public List<PontoModel> findAll(){
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public PontoModel findById(int id){
        return repository.findById(id).get();
    }

    @PostMapping("salvar")
    public PontoModel save(@RequestBody PontoModel model){
        return repository.save(model);
    }

    @PutMapping("atualizar")
    public PontoModel update(@RequestBody PontoModel model){
        return repository.save(model);
    }

    @DeleteMapping("excluir/{id}")
    public void delete(@PathVariable int id){
        repository.deleteById(id);
    }
}
