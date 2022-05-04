package com.carlos.cadastro.crud.service;

import com.carlos.cadastro.crud.model.Pessoa;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface CadastroService {

    Pessoa save(Pessoa entity);

    Pessoa findById(UUID id);

    List<Pessoa> findAll();
}
