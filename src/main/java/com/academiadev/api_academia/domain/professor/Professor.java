package com.academiadev.api_academia.domain.professor;

import com.academiadev.api_academia.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "professores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true, nullable = false, length = 20)
    private String cref;

    @Column(nullable = false, length = 50)
    private String especialidade;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Usuario usuario;
}
