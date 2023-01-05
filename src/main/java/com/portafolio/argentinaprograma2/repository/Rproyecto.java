package com.portafolio.argentinaprograma2.repository;

import com.portafolio.argentinaprograma2.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rproyecto extends JpaRepository<Proyecto, Integer> {
}
