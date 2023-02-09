package com.example.demojoinex.repository;

import com.example.demojoinex.model.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroModel, Integer> {
}
