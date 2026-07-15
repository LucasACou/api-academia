package com.academiadev.api_academia.repositories;

import com.academiadev.api_academia.domain.treino.Treino;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TreinoRepository extends JpaRepository<Treino, UUID> {
}
