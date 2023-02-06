package com.example.projetospringB.controller;


import com.example.projetospringB.model.clienteModel;
import com.example.projetospringB.repository.clienteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/cliente")
public class clienteController {

    private clienteRepository repository = new clienteRepository();

    @GetMapping("/search")
    public ResponseEntity<List<clienteModel>> get() {
        return ResponseEntity.ok(repository.getAll());
    }

    @PostMapping("/addCliente")
    public void addCliente(@RequestBody clienteModel model) {
        repository.addCliente(model);
    }

    @DeleteMapping("/deleteCliente")
    public void delete(@RequestBody clienteModel model) {
        repository.delete(model);
    }

    @PutMapping ("/updateCliente")
    public void update(@RequestBody clienteModel model) {
        repository.update(model);
    }

    @GetMapping("search/{id}")
    public ResponseEntity<clienteModel> getById(@PathVariable int id) {
        return ResponseEntity.ok(repository.getById(id));
    }

}
