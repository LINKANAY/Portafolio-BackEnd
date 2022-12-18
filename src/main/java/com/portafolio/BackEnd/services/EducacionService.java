
package com.portafolio.BackEnd.services;

import com.portafolio.BackEnd.models.Educacion;
import com.portafolio.BackEnd.repositories.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService {
    
    @Autowired EducacionRepository educacionRepository;
    
    public void crearEducacion (Educacion educacion){
        educacionRepository.save(educacion);
    }
    
    public void eliminarEducacion (Long id){
        educacionRepository.deleteById(id);
    }
    
    public List<Educacion> listaEducacion(){
        return educacionRepository.findAll();
    }
    
    public Educacion encontrarEducacion(Long id){
        return educacionRepository.findById(id).orElse(null);
    }
}
