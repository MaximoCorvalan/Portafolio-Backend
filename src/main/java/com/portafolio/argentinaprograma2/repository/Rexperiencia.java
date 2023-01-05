package com.portafolio.argentinaprograma2.repository;

import com.portafolio.argentinaprograma2.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rexperiencia extends JpaRepository<Experiencia,Integer> {
}
