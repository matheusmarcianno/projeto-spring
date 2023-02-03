package com.example.demo.controller;

import com.example.demo.model.ClienteModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/cliente")
    public ResponseEntity<List<ClienteModel>> get() {
        List<ClienteModel> list = new ArrayList<>();

        var cliente = new ClienteModel(1, "Matheus", "09679837971");
        var cliente1 = new ClienteModel(2, "Felipe", "09679831930");

        list.add(cliente);
        list.add(cliente1);

        return ResponseEntity.ok(list);
    }
}
