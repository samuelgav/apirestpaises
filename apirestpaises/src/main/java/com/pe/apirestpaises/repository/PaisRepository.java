package com.pe.apirestpaises.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pe.apirestpaises.entity.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long>{

}
