package com.example.apispring.controller;

import com.example.apispring.model.TarefaModel;
import com.example.apispring.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository repository;

    @GetMapping("/buscar")
    public List<TarefaModel> getAll() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public TarefaModel getById(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @GetMapping("/buscarStatus/{status}")
    public List<TarefaModel> getByStatus(@PathVariable String status) {
        String statusToUpper = status.toUpperCase();
        return repository.findByStatus(statusToUpper);
    }

    @GetMapping("/bucarPrioridade/{prioridade}")
    public List<TarefaModel> getByPrioridade(@PathVariable int prioridade) {
        return repository.findByPrioridade(prioridade);
    }

    @PostMapping("/salvar")
    public TarefaModel create(@RequestBody TarefaModel model) {
        return repository.save(model);
    }

    @PutMapping("/atualizar")
    public TarefaModel update(@RequestBody TarefaModel model) {
        return repository.save(model);
    }

    @DeleteMapping("/excluir/{id}")
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}
