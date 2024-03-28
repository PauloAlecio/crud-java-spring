package com.pauloalecio.crudjavaspring.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pauloalecio.crudjavaspring.domain.entity.Estado;



@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer>{
  Optional<Estado> findBySigla(String sigla);
  Optional<Estado>findByNome(String nome);
}
