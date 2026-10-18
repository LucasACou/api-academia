package com.academiadev.api_academia.domain.aluno;

public record AlunoRequestDTO(
        String nome, String email, String senha,
        String cpf, String telefone, Double altura, Double peso) {
}
