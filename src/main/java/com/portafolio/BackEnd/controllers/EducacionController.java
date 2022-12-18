      
package com.portafolio.BackEnd.controllers;

import com.portafolio.BackEnd.models.Educacion;
import com.portafolio.BackEnd.services.EducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducacionController {
    
    @Autowired EducacionService educacionService;
    
    @PostMapping("educacion/crear")
    public String crearEducacion(@RequestBody Educacion educacion){
        educacionService.crearEducacion(educacion);
        return "La educacion fue creada exitosamente";
    }
    
    @DeleteMapping("educacion/eliminar/{id}")
    public String eliminarEducacion(@PathVariable Long id){
        educacionService.eliminarEducacion(id);
        return "La educacion fue eliminada exitosamente";
    }
    
    @GetMapping ("educacion/traer")
    public List<Educacion> listaEducacion(){
        return educacionService.listaEducacion();
    }
    
    @PutMapping("educacion/editar/{id}")
    public Educacion editarEducacion(@PathVariable Long id, @RequestBody Educacion educacion){
        Educacion edu = educacionService.encontrarEducacion(id);
        edu.setNombre(educacion.getNombre());
        edu.setTitulo(educacion.getTitulo());
        edu.setFechaInicio(educacion.getFechaInicio());
        edu.setFechaFin(educacion.getFechaFin());
        edu.setLogo(educacion.getLogo());
        educacionService.crearEducacion(edu);
        return edu;
        
    }
    
}
