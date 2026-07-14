package com.academiadev.api_academia.domain.aluno;

import com.academiadev.api_academia.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "aluno")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(unique = true, nullable = false)
    private Integer cpf;

    @Column(nullable = false)
    private Integer telefone;

    @Column(nullable = false)
    private Float altura;

    @Column(nullable = false)
    private Float peso;

    @Column(nullable = false, updatable = false)
    private LocalDate dataInicio;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
