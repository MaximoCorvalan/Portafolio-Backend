package com.portafolio.argentinaprograma2.service;

import com.portafolio.argentinaprograma2.entity.Habilidad;
import com.portafolio.argentinaprograma2.repository.Rhabildad;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class Shabilidad {
    @Autowired
    public Rhabildad repoHabilidad;
    public void crearHabilidad(Habilidad habi){
        repoHabilidad.save(habi);

    }
    public void borrarHabilidad(int id){
        repoHabilidad.deleteById(id);
    }
    public List<Habilidad> verHabilidades(){
        List<Habilidad>verLista=repoHabilidad.findAll();
        return verLista;

    }
    public Habilidad encontrarHabililidad(int id){
        Habilidad habi = repoHabilidad.findById(id).orElse(null);
        return habi;

    }
    public void guardarHabilidad(Habilidad habi){
        repoHabilidad.save(habi);

    }

}
