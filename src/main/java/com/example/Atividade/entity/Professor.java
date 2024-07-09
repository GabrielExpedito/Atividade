package com.example.Atividade.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Integer id;

    private String nome;

    private String materia;

}
