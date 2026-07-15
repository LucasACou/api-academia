package com.academiadev.api_academia.repositories;

import com.academiadev.api_academia.domain.matricula.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MatriculaRepository extends JpaRepository<Matricula, UUID> {
}
