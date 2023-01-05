package com.portafolio.argentinaprograma2.controller;


import com.portafolio.argentinaprograma2.entity.Persona;
import com.portafolio.argentinaprograma2.service.Spersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persona")
@CrossOrigin(origins = "http://localhost:4200")
public class Cpersona {
    @Autowired
    public Spersona persoService;
    @GetMapping ("/lista")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoService.verPersonas();
    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public Persona encontrarPersona( @PathVariable int id){
       return persoService.encontrarPersona(id);
    }
    @PostMapping("/crear")
    public String crearPersona(@RequestBody Persona pers){
        persoService.crearPersona(pers);
        return "Se ha creado correctamente";

    }
    @DeleteMapping("/borrar/{id}")
    public String borrarPersona(@PathVariable ("id") int id){
        persoService.borrarPersona(id);
        return "se ha borrado correctamnte";
    }
    @PutMapping("/guardar")
      public String guardarPersona(@RequestBody Persona pers){
        persoService.guardarPersona(pers);
        return "Se ha guardado";
    }


}
