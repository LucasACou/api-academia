package com.academiadev.api_academia.controller;

import com.academiadev.api_academia.domain.aluno.Aluno;
import com.academiadev.api_academia.domain.aluno.AlunoRequestDTO;
import com.academiadev.api_academia.services.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aluno")
@RequiredArgsConstructor
public class AlunoController {

    private final AlunoService alunoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Aluno> getAll() {
        return alunoService.findAllAlunos();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno create(@RequestBody AlunoRequestDTO body) {
        return alunoService.createAluno(body);
    }
}
