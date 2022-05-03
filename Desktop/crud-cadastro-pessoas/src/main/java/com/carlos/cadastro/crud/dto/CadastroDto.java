package com.carlos.cadastro.crud.dto;

import com.carlos.cadastro.crud.model.Aluno;
import com.carlos.cadastro.crud.model.Pessoa;
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
        public Double notaFinal;

        public Aluno getalunoId() {
                return getalunoId();
        }

        public Aluno getnotaFinal() {
                return getnotaFinal();
        }
}
