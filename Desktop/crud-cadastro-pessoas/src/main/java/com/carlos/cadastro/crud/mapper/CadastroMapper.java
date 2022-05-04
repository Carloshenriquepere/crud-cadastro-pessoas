package com.carlos.cadastro.crud.mapper;

import com.carlos.cadastro.crud.dto.CadastroDto;
import com.carlos.cadastro.crud.model.Pessoa;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CadastroMapper {

    public  Pessoa toEntity(CadastroDto dto) {
        return  Pessoa.builder()
                .pessoaId(dto.getPessoaId())
                .dataCadastro(dto.getDataCadastro())
                .nome(dto.getNome())
                .dataNascimento(dto.getDataNascimento())
                .telefone(dto.getTelefone())
                .dataUltimaAlteracao(dto.getDataUltimaAlteracao())
                .aluno(dto.getAluno())
                .build();
    }
    public  CadastroDto toDto(Pessoa entity){
        return CadastroDto.builder()
                .pessoaId(entity.getPessoaId())
                .dataCadastro(entity.getDataCadastro())
                .nome(entity.getNome())
                .dataNascimento(entity.getDataNascimento())
                .telefone(entity.getTelefone())
                .dataUltimaAlteracao(entity.getDataUltimaAlteracao())
                .aluno(entity.getAluno())
                .build();
    }
}
