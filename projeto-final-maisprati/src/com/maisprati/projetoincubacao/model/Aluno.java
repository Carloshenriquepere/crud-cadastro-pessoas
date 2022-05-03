package com.maisprati.projetoincubacao.model;


public class Aluno {

    private Long notaFinal;

    public Aluno(Long notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Long getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Long notaFinal) {
        this.notaFinal = notaFinal;
    }
}
