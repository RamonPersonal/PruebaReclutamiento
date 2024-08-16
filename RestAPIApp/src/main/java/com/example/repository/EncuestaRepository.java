package com.example.repository;


import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.model.Encuesta;

public interface EncuestaRepository extends JpaRepository<Encuesta, Integer>{

}
