package com.example.Atividade.controller;

import com.example.Atividade.entity.Aluno;
import com.example.Atividade.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @GetMapping
    public ResponseEntity<List<Aluno>> obterAlunos() {
        return ResponseEntity.status(HttpStatus.FOUND).body(alunoService.obterAlunos());
    }

    @PostMapping
    public ResponseEntity<String> salvarAluno(@RequestBody Aluno aluno) {
        alunoService.inserirAluno(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body("Aluno inserido com sucesso");

    }







}
