package com.carlos.cadastro.crud.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")

    @Column(name = "aluno_id")
    private UUID alunoId;

    @Column(name = "nota_final")
    private Double notaFinal;

    @OneToOne(orphanRemoval = true)
    @JoinTable(name = "aluno_pessoa",
            joinColumns = @JoinColumn(name = "aluno_aluno_id"),
            inverseJoinColumns = @JoinColumn(name = "pessoa_pessoa_id"))
    private Pessoa pessoa;

}
