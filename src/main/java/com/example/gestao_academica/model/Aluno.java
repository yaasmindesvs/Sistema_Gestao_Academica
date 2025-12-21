package com.example.gestao_academica.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Aluno")
@Getter
@Setter

public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String matricula;

    @Column(nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "curso_id", nullable = false)
    private Curso curso;



}
