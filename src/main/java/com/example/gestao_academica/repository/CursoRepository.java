package com.example.gestao_academica.repository;

import com.example.gestao_academica.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
