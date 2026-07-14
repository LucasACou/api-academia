package com.academiadev.api_academia.domain.professor;

import com.academiadev.api_academia.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "professor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Professor {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(unique = true, nullable = false)
    private Integer cref;

    @Column(nullable = false)
    private String especialidade;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
