package com.portafolio.argentinaprograma2.repository;
import com.portafolio.argentinaprograma2.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Reducacion extends JpaRepository<Educacion,Integer> {
}
