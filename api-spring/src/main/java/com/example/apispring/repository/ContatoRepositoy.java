package com.example.apispring.repository;

import com.example.apispring.model.ContatoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContatoRepositoy extends JpaRepository<ContatoModel, Integer> {
    public List<ContatoModel> findByNome(String nome);
}
