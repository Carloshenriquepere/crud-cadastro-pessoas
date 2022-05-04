package com.carlos.cadastro.crud.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")

    @Column(name = "pessoa_id")
    private UUID pessoaId;

    @Column(name = "nome")
    private String nome;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;

    @Column(name = "data_ultima_alteracao")
    private LocalDate dataUltimaAlteracao;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @OneToOne(mappedBy = "pessoa", fetch = FetchType.LAZY, cascade  = CascadeType.ALL)
    @JoinColumn(name = "aluno_id", referencedColumnName = "pessoa_id")
    private Aluno aluno;
}
