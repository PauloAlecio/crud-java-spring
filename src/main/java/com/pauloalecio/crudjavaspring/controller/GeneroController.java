package com.pauloalecio.crudjavaspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pauloalecio.crudjavaspring.domain.entity.Sexo;
import com.pauloalecio.crudjavaspring.enums.Genero;
import com.pauloalecio.crudjavaspring.services.GeneroService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/genero")
public class GeneroController {

  private final GeneroService service;

  @GetMapping
  public List<Sexo> getAll() {
    var generos = service.getAll();
    return generos;
  }
  
  @GetMapping("/{id}")
  public Sexo getMethodName(@PathVariable Long id) {
    var genero =  service.getGeneroById(id);
    return genero;
  }
  
  @GetMapping("/nome")
  public ResponseEntity<Genero> getGeneroByNome(@RequestParam("param") String param){
    log.info("Buscando genero por nome:{} service:{}",param,GeneroController.class);
        
    var response = service.getGeneroByNome(Genero.ofDescricao(param)).getNome();
    return new ResponseEntity<>(response,HttpStatus.OK);
  }
  
}
