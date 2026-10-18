package com.academiadev.api_academia.controller;

import com.academiadev.api_academia.domain.professor.Professor;
import com.academiadev.api_academia.domain.professor.ProfessorRequestDTO;
import com.academiadev.api_academia.services.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professor")
@RequiredArgsConstructor
public class ProfessorController {

    private final ProfessorService professorService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Professor> getAll() {
        return professorService.findAllProfessores();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Professor create(@RequestBody ProfessorRequestDTO body) {
        return professorService.createProfessor(body);
    }

}
