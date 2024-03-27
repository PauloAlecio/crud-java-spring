package com.pauloalecio.crudjavaspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pauloalecio.crudjavaspring.domain.entity.Sexo;
import com.pauloalecio.crudjavaspring.services.GeneroService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


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
  
  
}
