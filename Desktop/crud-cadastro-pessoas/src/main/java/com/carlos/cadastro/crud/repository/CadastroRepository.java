package com.carlos.cadastro.crud.repository;

import com.carlos.cadastro.crud.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;


@Repository
public interface CadastroRepository  extends JpaRepository<Pessoa, UUID> {

}
