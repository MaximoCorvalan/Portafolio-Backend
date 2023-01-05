package com.portafolio.argentinaprograma2.service;

import com.portafolio.argentinaprograma2.entity.Proyecto;
import com.portafolio.argentinaprograma2.repository.Rproyecto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
@Transactional
public class Sproyecto {
    @Autowired
    public Rproyecto proyectRepo;

    public List<Proyecto>verProyectos(){
        List<Proyecto>verlista = proyectRepo.findAll();
        return  verlista;
    }
    public void crearProyecto(Proyecto proyect){
        proyectRepo.save(proyect);
    }
    public void borrarProyecto(int id){
        proyectRepo.deleteById(id);
    }
    public Proyecto encontrarProyecto(int id){
        Proyecto proyect = proyectRepo.findById(id).orElse(null);
        return proyect;

    }
    public void guardarProyecto(Proyecto proyect){
        proyectRepo.save(proyect);
    }


}
