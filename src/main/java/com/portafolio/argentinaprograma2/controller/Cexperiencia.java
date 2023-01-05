package com.portafolio.argentinaprograma2.controller;


import com.portafolio.argentinaprograma2.entity.Experiencia;
import com.portafolio.argentinaprograma2.service.Seducacion;
import com.portafolio.argentinaprograma2.service.Sexperiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("experiencia")
public class Cexperiencia {
    @Autowired
    public Sexperiencia experienciaServ;
    @GetMapping("/lista")
    @ResponseBody
    public List<Experiencia>verExperiencia(){
       return experienciaServ.verExperiencia();
    }
    @PostMapping("/crear")
    public String crearExperiencia(@RequestBody Experiencia exp){
        experienciaServ.crearExperiencia(exp);
        return "Se ha creado correctamente";
    }
    @DeleteMapping("/borrar/{id}")
    public String borrrarExperiencia8(@PathVariable("id") int id){
        experienciaServ.borrarExperiencia(id);
        return "Se ha borrado correctamente";
    }
    @GetMapping("/ver/{id}")
    @ResponseBody
    public String encontrarExpereincia(@PathVariable("/id")int id){
       experienciaServ.encontrarExperiencia(id);
        return "La experiencia tiene el id numero "+ id ;
    }
    @PutMapping("/guardar")
    public  String guardarEperiencia(@RequestBody Experiencia exp){
        experienciaServ.guardarExperiencia(exp);
        return "se ha guardado correctamente";
    }

}
