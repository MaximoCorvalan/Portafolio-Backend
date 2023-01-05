package com.portafolio.argentinaprograma2.controller;

import com.portafolio.argentinaprograma2.entity.Habilidad;
import com.portafolio.argentinaprograma2.service.Shabilidad;
import org.hibernate.dialect.AbstractHANADialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("habilidad")
public class Chabilidad {
    @Autowired
    public Shabilidad habilidadServ;
    @PostMapping("/crear")

    public String crearHabilidad(@RequestBody Habilidad habi){
        habilidadServ.crearHabilidad(habi);
        return "se ha creado correctamente";
    }
    @GetMapping("/ver/{id}")
    @ResponseBody
    public String encontrarHabilidad(@PathVariable("/id")int id){
        habilidadServ.encontrarHabililidad(id);
        return " la habilidad tiene el id numero " + id;
    }
    @GetMapping("/lista")
    @ResponseBody
    public List<Habilidad>verHabilidad(){
       return habilidadServ.verHabilidades();
    }
    @PutMapping("/guardar")
    public String guardarHabilidad(@RequestBody Habilidad habi){
        habilidadServ.guardarHabilidad(habi);
        return "Se ha guardado correctamente";
    }
}
