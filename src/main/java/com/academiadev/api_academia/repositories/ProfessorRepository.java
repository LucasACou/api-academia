package com.academiadev.api_academia.repositories;

import com.academiadev.api_academia.domain.professor.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProfessorRepository extends JpaRepository<Professor, UUID> {
}
