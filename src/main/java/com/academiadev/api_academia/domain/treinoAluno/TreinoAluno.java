package com.academiadev.api_academia.domain.treinoAluno;

import com.academiadev.api_academia.domain.aluno.Aluno;
import com.academiadev.api_academia.domain.exercicio.Exercicio;
import com.academiadev.api_academia.domain.treino.Treino;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "treino_aluno")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TreinoAluno {

    @Id
    @GeneratedValue
    private UUID id;

    private LocalDate dataInicio;
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "treino_id")
    private Treino treino;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
}
