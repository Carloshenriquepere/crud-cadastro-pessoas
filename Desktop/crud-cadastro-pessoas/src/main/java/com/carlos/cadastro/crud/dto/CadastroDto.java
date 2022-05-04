package com.carlos.cadastro.crud.dto;

import com.carlos.cadastro.crud.model.Aluno;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CadastroDto {

        private UUID pessoaId;
        private UUID alunoId;
        private String nome;
        private String telefone;
        private LocalDate dataCadastro;
        private LocalDate dataUltimaAlteracao;
        private LocalDate dataNascimento;
        private Double notaFinal;
        private Aluno aluno;
}
