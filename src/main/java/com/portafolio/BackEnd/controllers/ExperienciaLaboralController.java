
package com.portafolio.BackEnd.controllers;

import com.portafolio.BackEnd.models.ExperienciaLaboral;
import com.portafolio.BackEnd.services.ExperienciaLaboralService;
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
public class ExperienciaLaboralController {
    
    @Autowired ExperienciaLaboralService experienciaLaboralService;
    
    @PostMapping("experienciaLaboral/crear")
    public String crearExperiencia(@RequestBody ExperienciaLaboral experiencia){
        experienciaLaboralService.crearExperiencia(experiencia);
        return "La experiencia laboral fue creada exitosamente";
    }
    
    @DeleteMapping("experienciaLaboral/eliminar/{id}")
    public String eliminarExperiencia(@PathVariable Long id){
        experienciaLaboralService.eliminarExperiencia(id);
        return "La experiencia laboral fue eliminada exitosamente";
    }
    
    @GetMapping ("experienciaLaboral/traer")
    public List<ExperienciaLaboral> listaExperiencias(){
        return experienciaLaboralService.listaExperiencias();
    }
    
    @PutMapping("experienciaLaboral/editar/{id}")
    public ExperienciaLaboral editarExperienciaLaboral(@PathVariable Long id, @RequestBody ExperienciaLaboral experiencia){
        ExperienciaLaboral expe = experienciaLaboralService.encontrarExperiencia(id);
        expe.setNombre(experiencia.getNombre());
        expe.setCargo(experiencia.getCargo());
        expe.setFechaInicio(experiencia.getFechaInicio());
        expe.setFechaFin(experiencia.getFechaFin());
        expe.setLogo(experiencia.getLogo());
        return expe;
        
    }
    
}
