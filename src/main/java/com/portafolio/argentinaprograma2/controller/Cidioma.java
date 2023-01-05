package com.portafolio.argentinaprograma2.controller;
import com.portafolio.argentinaprograma2.entity.Idioma;
import com.portafolio.argentinaprograma2.service.Sidioma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("idioma")
public class Cidioma {
    @Autowired
    public Sidioma idiomaServ;
    @GetMapping("/lista")
    @ResponseBody
    public List<Idioma>verIdioma(){
    return   idiomaServ.verIdioma();
    }
    @PostMapping ("/crear")
    public String crearIdioma(@RequestBody Idioma idiom){
        idiomaServ.crearIdioma(idiom);
        return "se ha creado correctamente";
    }

    @PutMapping("/guarda")
    public String guadarIdioma(@RequestBody Idioma idiom){
        idiomaServ.guardarIdioma(idiom);
        return "se ha guardado correctamente";

    }

    @GetMapping("/ver/{id}")
    @ResponseBody
    public String EncontrarIdioma(@PathVariable("id")int id){
        idiomaServ.encontrarIdioma(id);
        return "el idioma que queres ver tiene el di nuemro "+ id;

    }

    @DeleteMapping("/borrar/{id}")
    public String borrarIdioma(@PathVariable("id") int id){
        idiomaServ.borrarIdioma(id);
        return "Se ha borrado correctamente";
    }

}
