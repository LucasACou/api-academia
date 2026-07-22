package com.academiadev.api_academia.services;

import com.academiadev.api_academia.domain.aluno.Aluno;
import com.academiadev.api_academia.domain.aluno.AlunoRequestDTO;
import com.academiadev.api_academia.domain.usuario.Usuario;
import com.academiadev.api_academia.domain.usuario.UsuarioRole;
import com.academiadev.api_academia.repositories.AlunoRepository;
import com.academiadev.api_academia.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final UsuarioRepository usuarioRepository;
    private final AlunoRepository alunoRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public Aluno createAluno(AlunoRequestDTO data) {

        Usuario newUsuario = new Usuario();
        newUsuario.setNome(data.nome());
        newUsuario.setEmail(data.email());
        newUsuario.setSenha(passwordEncoder.encode(data.senha()));
        newUsuario.setRole(UsuarioRole.ALUNO);

        usuarioRepository.save(newUsuario);

        Aluno newAluno = new Aluno();
        newAluno.setCpf(data.cpf());
        newAluno.setTelefone(data.telefone());
        newAluno.setAltura(data.altura());
        newAluno.setPeso(data.peso());
        newAluno.setUsuario(newUsuario);

        alunoRepository.save(newAluno);

        return newAluno;
    }

    public List<Aluno> findAllAlunos() {
        return alunoRepository.findAll();
    }
}
