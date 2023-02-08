package com.example.projetofilmes.controller;

import com.example.projetofilmes.model.FilmModel;
import com.example.projetofilmes.repository.FilmRepository;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
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

    @GetMapping("/searchByYear")
    public FilmModel findFilmByYear(){
        return repository.findFilmByYear();
    }

    @GetMapping("/searchCountry/{country}")
    public List<FilmModel> findByCountry(@PathVariable String country) {
        return repository.findByCountry(country);
    }

    @GetMapping("searchFilmsByReleaseDate/{releaseDate}")
    public List<FilmModel> findByReleaseDate(@PathVariable Date releaseDate) {
        return repository.findByReleaseDate(releaseDate);
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
