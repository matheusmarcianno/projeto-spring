package com.example.JoinExcAPI.repository;

import com.example.JoinExcAPI.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Integer> {
}
