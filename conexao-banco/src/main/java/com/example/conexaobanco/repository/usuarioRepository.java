package com.example.conexaobanco.repository;

import com.example.conexaobanco.model.usuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository<usuarioModel, Integer> {

}
