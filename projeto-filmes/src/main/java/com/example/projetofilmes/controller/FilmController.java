package com.example.projetofilmes.controller;

import com.example.projetofilmes.model.FilmModel;
import com.example.projetofilmes.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {
    @Autowired
    private FilmRepository repository;

    @GetMapping("/search")
    public ResponseEntity<List<FilmModel>> search() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("search/{id}")
    private ResponseEntity<FilmModel> getById(@PathVariable int id) {
        return ResponseEntity.ok(repository.findById(id).get());
    }

    @PutMapping("/update/{id}")
    public FilmModel udpate(@RequestBody FilmModel model) {
        return repository.save(model);
    }

    @PostMapping("/save")
    public FilmModel create(@RequestBody FilmModel model) {
        return repository.save(model);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }
}
