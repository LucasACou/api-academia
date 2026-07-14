package com.academiadev.api_academia.repositories;

import com.academiadev.api_academia.domain.treinoExercicios.TreinoExercicios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TreinoExerciciosRepository extends JpaRepository<UUID, TreinoExercicios> {
}
