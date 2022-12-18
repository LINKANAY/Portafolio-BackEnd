
package com.portafolio.BackEnd.services;

import com.portafolio.BackEnd.models.Ubicacion;
import com.portafolio.BackEnd.repositories.UbicacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UbicacionService {
    
    @Autowired UbicacionRepository ubicacionRepository;
    
    public void crearUbicacion(Ubicacion ubicacion){
        ubicacionRepository.save(ubicacion);
    }
    
    public void eliminarUbicacion(Long id){
        ubicacionRepository.deleteById(id);
    }
    
    public List<Ubicacion> listaUbicaciones(){
        return ubicacionRepository.findAll();
    }
    
    public Ubicacion encontrarUbicacion(Long id){
        return ubicacionRepository.findById(id).orElse(null);
    }
    
}
