package com.pauloalecio.crudjavaspring.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pauloalecio.crudjavaspring.domain.entity.Sexo;
import com.pauloalecio.crudjavaspring.enums.Genero;


@Repository
public interface GeneroRepository extends JpaRepository<Sexo,Long> {  
  Optional<Sexo> findByNome(Genero genero);
  // Sexo findByNome(String nome);
}
