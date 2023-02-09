package com.example.JoinExcAPI.controller;

import com.example.JoinExcAPI.model.VendaModel;
import com.example.JoinExcAPI.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaController {

    @Autowired
    private VendaRepository repository;

    @GetMapping("/vendas")
    public List<VendaModel> findAll(){
        return repository.findAll();
    }

    @GetMapping("/venda/{id}")
    public VendaModel findById(@PathVariable int id){
        return repository.findById(id).get();
    }

    @PostMapping("/salvar}")
    public VendaModel save(@RequestBody VendaModel venda){
        return repository.save(venda);
    }

    @PutMapping("/atualizar")
    public VendaModel update(@RequestBody VendaModel venda){
        return repository.save(venda);
    }

    @DeleteMapping("/excluir/{id}")
    public void delete(@PathVariable int id){
        repository.deleteById(id);
    }
}
