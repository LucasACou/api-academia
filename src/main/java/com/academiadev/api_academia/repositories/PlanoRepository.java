package com.academiadev.api_academia.repositories;

import com.academiadev.api_academia.domain.plano.Plano;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlanoRepository extends JpaRepository<Plano, UUID> {
}
