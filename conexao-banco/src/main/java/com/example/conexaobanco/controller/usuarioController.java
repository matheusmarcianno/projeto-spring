package com.example.conexaobanco.controller;

import com.example.conexaobanco.model.usuarioModel;
import com.example.conexaobanco.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class usuarioController {
    @Autowired
    private usuarioRepository repository;

    @GetMapping("/search")
    public ResponseEntity<List<usuarioModel>> serach() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("search/{id}")
    private ResponseEntity<usuarioModel> getById(@PathVariable int id) {
        return ResponseEntity.ok(repository.findById(id).get());
    }

    @PutMapping("/update")
    public usuarioModel udpate(@RequestBody usuarioModel model) {
        return repository.save(model);
    }

    @PostMapping("/save")
    public usuarioModel create(@RequestBody usuarioModel model) {
        return repository.save(model);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        repository.deleteById(id);
    }

    @GetMapping("/searchCpf/{cpf}")
    public usuarioModel getByCpf(@PathVariable String cpf){
        return repository.findByCPF(cpf);
    }

    @GetMapping("/searchNome/{nome}")
    public usuarioModel getByNome(@PathVariable String nome){
        return repository.findByNOME(nome);
    }

    @GetMapping("/searchPersonJava")
    public List<usuarioModel> getPersonJava(){
        return repository.findPersonJava();
    }

    /*@GetMapping("searchByCharacteristics/{NOME}/{SEXO}/{TIPO_SANGUINEO}")
    public usuarioModel findByCharacteristics(@PathVariable String NOME, @PathVariable String SEXO, @PathVariable String TIPO_SANGUINEO){
        return repository.findByCharacteristics(NOME,SEXO,TIPO_SANGUINEO);
    }*/

    @GetMapping("/searchOverAge")
    public List<usuarioModel> findOverAgeUsers(){
        return repository.findOverAgeUsers();
    }
}
