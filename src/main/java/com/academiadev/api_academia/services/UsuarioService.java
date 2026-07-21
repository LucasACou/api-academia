package com.academiadev.api_academia.services;

import com.academiadev.api_academia.domain.usuario.Usuario;
import com.academiadev.api_academia.domain.usuario.UsuarioRequestDTO;
import com.academiadev.api_academia.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Usuario createUsuario(UsuarioRequestDTO data) {

        Usuario newUsuario = new Usuario();
        newUsuario.setNome(data.nome());
        newUsuario.setEmail(data.email());
        newUsuario.setSenha(passwordEncoder.encode(data.senha()));
        newUsuario.setRole(data.role());

        usuarioRepository.save(newUsuario);

        return newUsuario;
    }
}
