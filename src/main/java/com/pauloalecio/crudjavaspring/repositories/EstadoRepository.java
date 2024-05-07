package com.pauloalecio.crudjavaspring.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pauloalecio.crudjavaspring.domain.entity.Estado;
import com.pauloalecio.crudjavaspring.enums.UF;



@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer>{
  Optional<Estado> findBySigla(UF sigla);
  Optional<Estado> findByNome(UF nome);
}
