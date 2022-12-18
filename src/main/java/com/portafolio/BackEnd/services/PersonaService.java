
package com.portafolio.BackEnd.services;

import com.portafolio.BackEnd.models.Persona;
import com.portafolio.BackEnd.repositories.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    
    @Autowired PersonaRepository personaRepository;
    
    public void crearPersona(Persona persona){
        personaRepository.save(persona);
    }
    
    public void eliminarPersona(Long id){
        personaRepository.deleteById(id);
    }
    
    public List<Persona> listaPersonas(){
        return personaRepository.findAll();
    }
    
    public Persona encontrarPersona(Long id){
        return personaRepository.findById(id).orElse(null);
    }
}
