package com.academiadev.api_academia.repositories;

import com.academiadev.api_academia.domain.treinoAluno.TreinoAluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TreinoAlunoRepository extends JpaRepository<TreinoAluno, UUID> {
}
