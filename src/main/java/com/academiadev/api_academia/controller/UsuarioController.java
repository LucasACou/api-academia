package com.academiadev.api_academia.controller;

import com.academiadev.api_academia.domain.professor.Professor;
import com.academiadev.api_academia.domain.usuario.Usuario;
import com.academiadev.api_academia.domain.usuario.UsuarioRequestDTO;
import com.academiadev.api_academia.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> getAll() {
        return usuarioService.findAllUsuarios();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario create(@RequestBody UsuarioRequestDTO body) {
        return usuarioService.createUsuario(body);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProfessor(@PathVariable UUID id) {
        usuarioService.deleteProfessorById(id);
    }
}
