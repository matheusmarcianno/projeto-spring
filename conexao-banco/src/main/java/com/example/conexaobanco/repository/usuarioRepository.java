package com.example.conexaobanco.repository;

import com.example.conexaobanco.model.usuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface usuarioRepository extends JpaRepository<usuarioModel, Integer> {
    public usuarioModel findByCPF(String CPF);
    public usuarioModel findByNOME(String NOME);

    @Query(value = "SELECT * FROM MATHEUS_USUARIOS WHERE upper(NOME) LIKE '%JAVA%'", nativeQuery = true)
    public List<usuarioModel> findPersonJava();

    @Query(value = "SELECT * FROM MATHEUS_USUARIOS WHERE NOME = ?1 AND SEXO = ?2 AND TIPO_SANGUINEO = ?3", nativeQuery = true)
    public usuarioModel findByCharacteristics(String NOME, String SEXO, String TIPO_SANGUINEO);
}
