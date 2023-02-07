package com.example.projetofilmes.repository;

import com.example.projetofilmes.model.FilmModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FilmRepository extends JpaRepository<FilmModel, Integer> {
    @Query(value = )
}
