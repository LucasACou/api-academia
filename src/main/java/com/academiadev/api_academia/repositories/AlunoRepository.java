package com.academiadev.api_academia.repositories;

import com.academiadev.api_academia.domain.aluno.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlunoRepository extends JpaRepository<Aluno, UUID> {
}
