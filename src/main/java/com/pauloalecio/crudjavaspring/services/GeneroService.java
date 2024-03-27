package com.pauloalecio.crudjavaspring.services;

import java.util.List;

import com.pauloalecio.crudjavaspring.domain.entity.Sexo;

public interface GeneroService {
  
  List<Sexo>getAll();

  Sexo getGeneroById(Long id);
}
