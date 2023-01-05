package com.portafolio.argentinaprograma2.service;

import com.portafolio.argentinaprograma2.entity.Educacion;
import com.portafolio.argentinaprograma2.repository.Reducacion;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class Seducacion {
    @Autowired
    public Reducacion educacionRepo;
    
    public List<Educacion>verEducacion(){
        List<Educacion>veredu=educacionRepo.findAll();
        return veredu;
    }
    public void crearEducacion(Educacion edu){
        educacionRepo.save(edu);
    }
    public  void  borrarEducacion(int id){
        educacionRepo.deleteById(id);
    }
    public Educacion encontrarEducacion(int id){
        Educacion edu = educacionRepo.findById(id).orElse(null);
        return edu;
    }
    public void guardarEducacion(Educacion edu){
        educacionRepo.save(edu);
    }

}
