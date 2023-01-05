package com.portafolio.argentinaprograma2.repository;

import com.portafolio.argentinaprograma2.entity.Persona;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface Rpersona extends JpaRepository <Persona,Integer> {

}
