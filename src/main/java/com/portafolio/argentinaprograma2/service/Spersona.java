package com.portafolio.argentinaprograma2.service;
import com.portafolio.argentinaprograma2.entity.Persona;
import com.portafolio.argentinaprograma2.repository.Rpersona;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class Spersona {
    @Autowired
   public   Rpersona personaRepo;
public List<Persona>verPersonas(){
        List<Persona>listasPersonas=personaRepo.findAll();
       return listasPersonas;
}
public void crearPersona (Persona perso){
      personaRepo.save(perso);
}
public void borrarPersona(int id){
    personaRepo.deleteById(id);
}
public Persona encontrarPersona(int id){
  Persona perso  = personaRepo.findById(id).orElse(null);
  return perso;
}
   public void guardarPersona (Persona pers){
        personaRepo.save(pers);
    }

}

