package com.academiadev.api_academia.domain.professor;

public record ProfessorRequestDTO(
        String nome, String email, String senha,
        String cref, String especialidade) {
}
