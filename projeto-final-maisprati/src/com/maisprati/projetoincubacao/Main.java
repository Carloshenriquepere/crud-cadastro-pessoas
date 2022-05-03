package com.maisprati.projetoincubacao;

import com.maisprati.projetoincubacao.service.PessoaService;

public class Main {
    public static void main(String[] args) throws Exception {
        PessoaService service = new PessoaService();
        service.menu();
    }

}
