package com.pauloalecio.crudjavaspring.services;

import java.util.List;

import com.pauloalecio.crudjavaspring.domain.entity.Estado;
import com.pauloalecio.crudjavaspring.enums.UF;


public interface EstadoService {
   
  List<Estado>getAll();

  Estado getEstadoById(Integer id);

  Estado getBySigla(UF sigla);

  Estado getByNome(UF nome);
}
