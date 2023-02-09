package com.example.demojoinex.repository;

import com.example.demojoinex.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Integer> {

}
