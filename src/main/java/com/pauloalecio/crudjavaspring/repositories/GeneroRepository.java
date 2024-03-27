package com.pauloalecio.crudjavaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pauloalecio.crudjavaspring.domain.entity.Sexo;

@Repository
public interface SexoRepository extends JpaRepository<Sexo,Long> {  
}
