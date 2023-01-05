package com.portafolio.argentinaprograma2.service;

import com.portafolio.argentinaprograma2.entity.Experiencia;
import com.portafolio.argentinaprograma2.repository.Rexperiencia;
import com.portafolio.argentinaprograma2.repository.Rpersona;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.UnexpectedRollbackException;

import java.util.List;

@Service
@Transactional
public class Sexperiencia {
    @Autowired
    public Rexperiencia rexperienciaRepo;
    public List<Experiencia>verExperiencia(){
        List<Experiencia>verlista= rexperienciaRepo.findAll();
        return verlista;
    }
    public void crearExperiencia(Experiencia exp){
        rexperienciaRepo.save(exp);

    }
    public Experiencia encontrarExperiencia(int id){
     Experiencia exp= rexperienciaRepo.findById(id).orElse(null);
     return  exp;
    }
    public void  borrarExperiencia(int id){
        rexperienciaRepo.deleteById(id);
    }
    public void guardarExperiencia(Experiencia exp){
         rexperienciaRepo.save(exp);
    }


}
