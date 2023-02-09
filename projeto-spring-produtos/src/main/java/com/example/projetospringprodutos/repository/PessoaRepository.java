package com.example.projetospringprodutos.repository;

import com.example.projetospringprodutos.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Integer> {


}
