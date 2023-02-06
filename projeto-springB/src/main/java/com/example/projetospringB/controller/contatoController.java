package com.example.projetospringB.controller;

import com.example.projetospringB.model.clienteModel;
import com.example.projetospringB.model.contatoModel;
import com.example.projetospringB.repository.contatoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
public class contatoController {
    private contatoRepository repository = new contatoRepository();

    @GetMapping("/search")
    public ResponseEntity<List<contatoModel>> get() {
        return ResponseEntity.ok(repository.getAll());
    }

    @PostMapping("/addContato")
    public void addContato(@RequestBody contatoModel model) {
        repository.addCliente(model);
    }

    @DeleteMapping("/deleteCliente")
    public void delete(@RequestBody contatoModel model) {
        repository.delete(model);
    }

    @PutMapping ("/updateCliente")
    public void update(@RequestBody contatoModel model) {
        repository.update(model);
    }

    @GetMapping("search/{id}")
    public ResponseEntity<contatoModel> getById(@PathVariable int id) {
        return ResponseEntity.ok(repository.getById(id));
    }
}
