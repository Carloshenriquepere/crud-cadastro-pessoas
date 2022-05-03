package com.maisprati.projetoincubacao.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pessoa extends Aluno{

    private Integer id;
    private String nome;
    private String telefone;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAlteracao;
    private LocalDate dataNascimento;

    public Pessoa(Integer id, String nome, String telefone, LocalDate dataCadastro, LocalDate dataUltimaAlteracao, LocalDate dataNascimento, Long notaFinal) {
        super(notaFinal);
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
        this.dataUltimaAlteracao = dataUltimaAlteracao;
        this.dataNascimento = dataNascimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataUltimaAlteracao() {
        return dataUltimaAlteracao;
    }

    public void setDataUltimaAlteracao(LocalDate dataUltimaAlteracao) {
        this.dataUltimaAlteracao = dataUltimaAlteracao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return " Nome: '" + nome + '\'' +
                ", Fone: '" + telefone + '\'' +
                ", Data de Nascimento: " + dataNascimento +
                ", Nota final: " + getNotaFinal();
    }
}
