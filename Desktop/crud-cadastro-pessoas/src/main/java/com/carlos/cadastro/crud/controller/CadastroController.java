package com.carlos.cadastro.crud.controller;

import com.carlos.cadastro.crud.dto.CadastroDto;
import com.carlos.cadastro.crud.mapper.CadastroMapper;
import com.carlos.cadastro.crud.service.CadastroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class CadastroController {

    private final CadastroService service;

    @PostMapping
    public ResponseEntity<CadastroDto> save(@RequestBody CadastroDto dto){
        return  new ResponseEntity<>(
                CadastroMapper.toDto(service.save(CadastroMapper.toEntity(dto))),
                HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CadastroDto>> findAll(){
        return new ResponseEntity<>(
                service.findAll().stream()
                        .map(CadastroMapper::toDto).collect(Collectors.toList()),
                HttpStatus.OK);
    }
}
