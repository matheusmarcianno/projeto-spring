package com.example.projetofilmes.repository;

import com.example.projetofilmes.model.FilmModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.sql.Date;
import java.util.List;

public interface FilmRepository extends JpaRepository<FilmModel, Integer> {

    @Query(value = "SELECT * FROM M_FILMES WHERE DATA_LANCAMENTO >= TO_DATE('01/01/2023', 'DD/MM/YYYY')", nativeQuery = true)
    public FilmModel findFilmByYear();

    @Query(value = "SELECT * FROM M_FILMES WHERE PAIS_ORIGEM = ?", nativeQuery = true)
    public List<FilmModel> findByCountry(String originCountry);

    public List<FilmModel> findByReleaseDate(Date releaseDate);
}
