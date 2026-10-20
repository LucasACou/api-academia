package com.academiadev.api_academia.domain.aluno;

import com.academiadev.api_academia.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "alunos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true, nullable = false, length = 11)
    private String cpf;

    @Column(nullable = false, length = 15)
    private String telefone;

    @Column(nullable = false)
    private Double altura;

    @Column(nullable = false)
    private Double peso;

    @Column(nullable = false, updatable = false)
    private LocalDate dataInicio;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private Usuario usuario;

    @PrePersist
    public void prePersist() {
        this.dataInicio = LocalDate.now();
    }
}
