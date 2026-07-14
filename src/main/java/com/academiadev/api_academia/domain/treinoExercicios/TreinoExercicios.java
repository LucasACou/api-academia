package com.academiadev.api_academia.domain.treinoExercicios;

import com.academiadev.api_academia.domain.exercicio.Exercicio;
import com.academiadev.api_academia.domain.treino.Treino;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "treino-exercicios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TreinoExercicios {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private Integer series;

    @Column(nullable = false)
    private Integer repeticoes;

    @Column(nullable = false)
    private Integer carga;

    @ManyToOne
    @JoinColumn(name = "treino_id")
    private Treino treino;

    @ManyToOne
    @JoinColumn(name = "exercicio_id")
    private Exercicio exercicio;
}
