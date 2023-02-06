package com.example.projetospringB.controller;

import com.example.projetospringB.model.contatoModel;
import com.example.projetospringB.model.tarefaModel;
import com.example.projetospringB.repository.contatoRepository;
import com.example.projetospringB.repository.tarefaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefa")
public class tarefaController {
    private tarefaRepository repository = new tarefaRepository();

    @GetMapping("/search")
    public ResponseEntity<List<tarefaModel>> get() {
        return ResponseEntity.ok(repository.getAll());
    }

    @PostMapping("/add")
    public void add(@RequestBody tarefaModel model) {
        repository.add(model);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody tarefaModel model) {
        repository.delete(model);
    }

    @PutMapping ("/update")
    public void update(@RequestBody tarefaModel model) {
        repository.update(model);
    }

    @GetMapping("search/{id}")
    public ResponseEntity<tarefaModel> getById(@PathVariable int id) {
        return ResponseEntity.ok(repository.getById(id));
    }
}
