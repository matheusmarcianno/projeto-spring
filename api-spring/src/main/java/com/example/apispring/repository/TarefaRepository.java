package com.example.apispring.repository;

import com.example.apispring.model.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarefaRepository extends JpaRepository<TarefaModel, Integer> {

    public List<TarefaModel> findByStatus(String status);

    public List<TarefaModel> findByPrioridade(int piroridade);
}
