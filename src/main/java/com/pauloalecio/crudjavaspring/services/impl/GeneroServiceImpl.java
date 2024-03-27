package com.pauloalecio.crudjavaspring.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pauloalecio.crudjavaspring.domain.entity.Sexo;
import com.pauloalecio.crudjavaspring.exception.GeneroException;
import com.pauloalecio.crudjavaspring.repositories.GeneroRepository;
import com.pauloalecio.crudjavaspring.services.GeneroService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class GeneroServiceImpl implements GeneroService{
  private final GeneroRepository repository;

  @Override
  public List<Sexo> getAll() {
    var sexos = repository.findAll();
    return sexos;
  }

  @Override
  public Sexo getGeneroById(Long id) {
    var sexo = repository.findById(id).orElseThrow(GeneroException::new);
    return sexo;
  }

  
}
