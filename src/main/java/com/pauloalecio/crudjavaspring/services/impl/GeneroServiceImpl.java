package com.pauloalecio.crudjavaspring.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pauloalecio.crudjavaspring.domain.entity.Sexo;
import com.pauloalecio.crudjavaspring.enums.Genero;
import com.pauloalecio.crudjavaspring.exception.GeneroException;
import com.pauloalecio.crudjavaspring.repositories.GeneroRepository;
import com.pauloalecio.crudjavaspring.services.GeneroService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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

  @Override
  public Sexo getGeneroByNome(Genero genero) {
    var sexo = repository.findByNome(genero).orElseThrow(GeneroException::new);
    log.info("Genero response {}, Service:{}",sexo, GeneroServiceImpl.class);
    return sexo;
  }

  
}
