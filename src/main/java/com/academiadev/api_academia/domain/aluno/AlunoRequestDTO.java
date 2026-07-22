package com.academiadev.api_academia.domain.aluno;

import com.academiadev.api_academia.domain.usuario.UsuarioRole;

public record AlunoRequestDTO(
        String nome, String email, String senha,
        String cpf, String telefone, Double altura, Double peso) {
}
