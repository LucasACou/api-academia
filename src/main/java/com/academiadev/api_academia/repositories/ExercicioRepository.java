package com.academiadev.api_academia.repositories;

import com.academiadev.api_academia.domain.exercicio.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExercicioRepository extends JpaRepository<Exercicio, UUID> {
}
