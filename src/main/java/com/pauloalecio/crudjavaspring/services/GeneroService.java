package com.pauloalecio.crudjavaspring.services;

import java.util.List;

import com.pauloalecio.crudjavaspring.domain.entity.Sexo;
import com.pauloalecio.crudjavaspring.enums.Genero;

public interface GeneroService {
  
  List<Sexo>getAll();

  Sexo getGeneroById(Long id);

  Sexo getGeneroByNome(Genero genero);
}
