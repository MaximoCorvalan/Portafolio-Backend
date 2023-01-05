package com.portafolio.argentinaprograma2.controller;
import com.portafolio.argentinaprograma2.entity.Educacion;
import com.portafolio.argentinaprograma2.service.Seducacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("educacion")
public class Ceducacion {
    @Autowired
    public Seducacion educacionService;
    @GetMapping("/lista")
    @ResponseBody
    public List<Educacion> verEducacion() {
       return educacionService.verEducacion();
    }
    @PostMapping("/crear")
    public String crearEducacion(@RequestBody Educacion edu){
        educacionService.crearEducacion(edu);
        return "Se ha creado correctamente";
    }
    @GetMapping("/ver/{id}")
    @ResponseBody
    public String encontrarEducacion(@PathVariable ("id") int id){
        educacionService.encontrarEducacion(id);
        return "La persona porsee el id numero"+ id;
    }
    @DeleteMapping("/borrar/{id}")
    public String borrarEducacion(@PathVariable("id") int id){
        educacionService.borrarEducacion(id);
        return "la persona se ha borrado correctamente";
    }
    @PutMapping("/guardar")
    public String guardarEduacion(@RequestBody Educacion edu){
        educacionService.guardarEducacion(edu);
        return "Se ha guardado correctamente";
    }

}
