package com.pauloalecio.crudjavaspring.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pauloalecio.crudjavaspring.domain.entity.Estado;
import com.pauloalecio.crudjavaspring.exception.EstadoException;
import com.pauloalecio.crudjavaspring.repositories.EstadoRepository;
import com.pauloalecio.crudjavaspring.services.EstadoService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class EstadoServiceImpl implements EstadoService {
  
  private final EstadoRepository repository;

  @Override
  public List<Estado> getAll() {
    var estados = repository.findAll();
    return estados;
  }

  @Override
  public Estado getEstadoById(Integer id) {
    var estado = repository.findById(id).orElseThrow(EstadoException::new);
    log.info("{}, Service: {}",estado, EstadoServiceImpl.class);
    return estado;
  }

  @Override
  public Estado getBySigla(String sigla) {
    var estado = repository.findBySigla(sigla).orElseThrow(EstadoException::new);
    log.info("{}, Service: {}",estado, EstadoServiceImpl.class);
    return estado;
  }

  @Override
  public Estado getByNome(String nome) {
    var estado = repository.findByNome(nome).orElseThrow(EstadoException::new);
    log.info("{}, Service: {}",estado, EstadoServiceImpl.class);
    return estado;
  }
  
}
