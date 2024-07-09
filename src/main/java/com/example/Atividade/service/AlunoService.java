package com.example.Atividade.service;

import com.example.Atividade.entity.Aluno;
import com.example.Atividade.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;


    public List<Aluno> obterAlunos() {
        return alunoRepository.findAll();
    }

    public void inserirAluno(Aluno aluno) {
        alunoRepository.save(aluno);
    }



}
