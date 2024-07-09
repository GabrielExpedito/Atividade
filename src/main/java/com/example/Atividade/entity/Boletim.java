package com.example.Atividade.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Boletim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    private double notas;

    private double media;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    private String status;


}
