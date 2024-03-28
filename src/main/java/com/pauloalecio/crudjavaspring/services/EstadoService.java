package com.pauloalecio.crudjavaspring.services;

import java.util.List;

import com.pauloalecio.crudjavaspring.domain.entity.Estado;


public interface EstadoService {
   
  List<Estado>getAll();

  Estado getEstadoById(Integer id);
}
