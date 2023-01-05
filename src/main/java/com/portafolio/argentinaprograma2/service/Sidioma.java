package com.portafolio.argentinaprograma2.service;

import com.portafolio.argentinaprograma2.entity.Idioma;
import com.portafolio.argentinaprograma2.repository.Ridioma;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class Sidioma {
    @Autowired
    public Ridioma idiomaRepo;
    public void crearIdioma(Idioma idiom){
        idiomaRepo.save(idiom);

    }
    public  void borrarIdioma(int id){
        idiomaRepo.deleteById(id);
    }
    public List<Idioma>verIdioma(){
        List<Idioma>verlista = idiomaRepo.findAll();
        return  verlista;
    }
    public void guardarIdioma(Idioma idiom){
        idiomaRepo.save(idiom);

    }
    public Idioma encontrarIdioma(int id){
       Idioma idiom = idiomaRepo.findById(id).orElse(null);
       return idiom;
    }

}
