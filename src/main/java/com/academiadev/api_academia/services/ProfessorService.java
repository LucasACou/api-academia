package com.academiadev.api_academia.services;

import com.academiadev.api_academia.domain.professor.Professor;
import com.academiadev.api_academia.domain.professor.ProfessorRequestDTO;
import com.academiadev.api_academia.domain.usuario.Usuario;
import com.academiadev.api_academia.domain.usuario.UsuarioRole;
import com.academiadev.api_academia.repositories.ProfessorRepository;
import com.academiadev.api_academia.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfessorService {

    private final UsuarioRepository usuarioRepository;
    private final ProfessorRepository professorRepository;
    private final PasswordEncoder passwordEncoder;

    public Professor createProfessor(ProfessorRequestDTO data) {

        Usuario newUsuario = new Usuario();
        newUsuario.setNome(data.nome());
        newUsuario.setEmail(data.email());
        newUsuario.setSenha(passwordEncoder.encode(data.senha()));
        newUsuario.setRole(UsuarioRole.PROFESSOR);

        usuarioRepository.save(newUsuario);

        Professor newProfessor = new Professor();
        newProfessor.setCref(data.cref());
        newProfessor.setEspecialidade(data.especialidade());
        newProfessor.setUsuario(newUsuario);

        professorRepository.save(newProfessor);

        return newProfessor;
    }

    public List<Professor> findAllProfessores() {
        return professorRepository.findAll();
    }

}
