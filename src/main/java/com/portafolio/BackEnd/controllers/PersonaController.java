
package com.portafolio.BackEnd.controllers;

import com.portafolio.BackEnd.models.Educacion;
import com.portafolio.BackEnd.models.Persona;
import com.portafolio.BackEnd.services.EducacionService;
import com.portafolio.BackEnd.services.PersonaService;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired PersonaService personaService;
    @Autowired EducacionService educacionService;
    
    @PostMapping("persona/crear")
    public String crearPersona(@RequestBody Persona persona){
        personaService.crearPersona(persona);
        return "La persona fue creada exitosamente";
    }
    
    @DeleteMapping("persona/eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id){
        personaService.eliminarPersona(id);
        return "La persona fue eliminada exitosamente";
    }
    
    @GetMapping ("persona/traer")
    public List<Persona> listaPersonas(){
        return personaService.listaPersonas();
    }
    
    @PutMapping("persona/editar/{id}")
    public Persona editarPersona(@PathVariable Long id, @RequestBody Persona persona){
        Persona perso = personaService.encontrarPersona(id);
        perso.setNombre(persona.getNombre());
        perso.setApellido(persona.getApellido());
        perso.setSobreMi(persona.getSobreMi());
        perso.setTitulo(persona.getTitulo());
        perso.setEmail(persona.getEmail());
        perso.setFoto(persona.getFoto());
        personaService.crearPersona(perso);
        return perso;        
    }
    
    @GetMapping ("persona/traer/estudios/{id}")
    public Set<Educacion> verEducaciones(@PathVariable Long id){
        return personaService.encontrarPersona(id).getEstudios();
    }
    
}
