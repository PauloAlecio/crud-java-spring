package com.pauloalecio.crudjavaspring.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pauloalecio.crudjavaspring.domain.entity.Estado;
import com.pauloalecio.crudjavaspring.enums.UF;
import com.pauloalecio.crudjavaspring.services.EstadoService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/estado")
public class EstadoController {

  private final EstadoService service;
  
  @GetMapping
  public ResponseEntity<List<Estado>> getAll(){
    var estados = service.getAll();
    return ResponseEntity.status(HttpStatus.OK).body(estados);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Estado> getById(@PathVariable Integer id){
    var estado  =  service.getEstadoById(id);
    log.info("Estado {}, Service: {}",estado, EstadoController.class);

    return new ResponseEntity<>(estado,HttpStatus.OK);
  }

  @GetMapping("/nome")
  public ResponseEntity<Estado> getByNome(@RequestParam("param") String nome){
    log.info("Buscando Estado por nome: {}, Service: {}",nome, EstadoController.class);
    var estado  =  service.getByNome(UF.ofNome(nome));
    return new ResponseEntity<>(estado,HttpStatus.OK);
  }

  @GetMapping("/sigla")
  public ResponseEntity<Estado> getBySigla(@RequestParam(name = "param") String sigla){
    log.info("Buscando Estado por sigla: {}, Service: {}",sigla, EstadoController.class);
    var estado  =  service.getBySigla(UF.ofSigla(sigla));
    return new ResponseEntity<>(estado,HttpStatus.OK);
  }

}
