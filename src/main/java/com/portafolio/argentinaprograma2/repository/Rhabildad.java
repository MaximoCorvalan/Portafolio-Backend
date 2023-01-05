package com.portafolio.argentinaprograma2.repository;

import com.portafolio.argentinaprograma2.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rhabildad extends JpaRepository<Habilidad, Integer> {
}
