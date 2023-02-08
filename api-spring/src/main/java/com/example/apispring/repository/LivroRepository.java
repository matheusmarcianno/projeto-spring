package com.example.apispring.repository;

import com.example.apispring.model.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroModel, Integer> {

}
