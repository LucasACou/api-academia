package com.academiadev.api_academia.domain.usuario;

import com.academiadev.api_academia.domain.aluno.Aluno;
import com.academiadev.api_academia.domain.professor.Professor;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false, length = 100)
    private String senha;

    @Column(nullable = false)
    private Boolean status;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dataCriacao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 15)
    private UsuarioRole role;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.REMOVE)
    @JsonIgnore
    private Professor professor;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.REMOVE)
    @JsonIgnore
    private Aluno aluno;

    @PrePersist
    public void prePersist() {
        if(dataCriacao == null) {
            this.dataCriacao = LocalDateTime.now();
        }

        if(status == null) {
            this.status = true;
        }
    }
}
