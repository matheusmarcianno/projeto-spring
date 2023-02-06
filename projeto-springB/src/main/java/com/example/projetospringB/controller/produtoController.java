package com.example.projetospringB.controller;

import com.example.projetospringB.model.produtoModel;
import com.example.projetospringB.repository.produtoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class produtoController {
    private produtoRepository repository = new produtoRepository();

    @GetMapping("/search")
    public ResponseEntity<List<produtoModel>> get() {
        return ResponseEntity.ok(repository.getAll());
    }

    @PostMapping("/add")
    public void add(@RequestBody produtoModel model) {
        repository.add(model);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody produtoModel model) {
        repository.delete(model);
    }

    @PutMapping ("/update")
    public void update(@RequestBody produtoModel model) {
        repository.update(model);
    }

    @GetMapping("search/{id}")
    public ResponseEntity<produtoModel> getById(@PathVariable int id) {
        return ResponseEntity.ok(repository.getById(id));
    }
}
