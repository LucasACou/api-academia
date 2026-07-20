package com.academiadev.api_academia.domain.usuario;

public record UsuarioRequestDTO(
        String nome, String email, String senha, UsuarioRole role) {

}
