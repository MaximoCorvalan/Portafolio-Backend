package com.portafolio.argentinaprograma2.controller;

import com.portafolio.argentinaprograma2.entity.Proyecto;
import com.portafolio.argentinaprograma2.service.Sproyecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("proyecto")
@CrossOrigin(origins = "http://localhost:4200")
public class Cproyecto {
    @Autowired
    public Sproyecto proyectoServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<Proyecto>verProyecto(){
        return proyectoServ.verProyectos();
    }
    @PostMapping("/crear")
    public String crearProyecto(@RequestBody Proyecto proyect){
        proyectoServ.crearProyecto(proyect);
        return "Se ha creado correctamente";

    }
    @PutMapping("/guardar")
    public String guardarproyecto(@RequestBody Proyecto proyect){
        proyectoServ.guardarProyecto(proyect);
        return "Se ha guardado correctamente";
    }
    @DeleteMapping("/borrar/{id}")
    public String borrarProyecto(@PathVariable ("id")int id){
        proyectoServ.borrarProyecto(id);
        return "Se ha borrado correctamente";
    }
    @GetMapping("/ver/{id}")
    @ResponseBody
    public String encontrarProyecto(@PathVariable("id")int id){
       proyectoServ.encontrarProyecto(id) ;
       return "el proyecto tiene el id numero "+ 1;
    }

}
