package com.example.gestao_academica.controller;

import com.example.gestao_academica.model.Curso;
import com.example.gestao_academica.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController{
    
    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    public ResponseEntity<Curso> cadastrarCurso(@RequestBody Curso curso){
        Curso cursoSalvo = cursoRepository.save(curso);
        return ResponseEntity.status(201).body(cursoSalvo);
    }
    @GetMapping
    public List<Curso> listarCursos(){
        return cursoRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Curso> buscarCurso(@PathVariable Long id) {
        return cursoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerCurso(@PathVariable Long id) {
        if (!cursoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        cursoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    }



