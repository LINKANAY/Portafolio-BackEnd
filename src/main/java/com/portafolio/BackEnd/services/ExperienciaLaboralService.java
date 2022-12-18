
package com.portafolio.BackEnd.services;

import com.portafolio.BackEnd.models.ExperienciaLaboral;
import com.portafolio.BackEnd.repositories.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService {
    
    @Autowired ExperienciaLaboralRepository experienciaLaboralRepository;
    
    public void crearExperiencia( ExperienciaLaboral experienciaLaboral){
        experienciaLaboralRepository.save(experienciaLaboral);
    }
    
    public void eliminarExperiencia(Long id){
        experienciaLaboralRepository.deleteById(id);
    }
    
    public List<ExperienciaLaboral> listaExperiencias(){
        return experienciaLaboralRepository.findAll();
    }
    
    public ExperienciaLaboral encontrarExperiencia(Long id){
        return experienciaLaboralRepository.findById(id).orElse(null);
    }
}
