package com.portafolio.BackEnd.controllers;

import com.portafolio.BackEnd.models.Ubicacion;
import com.portafolio.BackEnd.services.UbicacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UbicacionController {

    @Autowired
    UbicacionService ubicacionService;

    @PostMapping("ubicacion/crear")
    public String crearUbicacion(@RequestBody Ubicacion ubicacion) {
        ubicacionService.crearUbicacion(ubicacion);
        return "La ubicacion fue creada exitosamente";
    }

    @DeleteMapping("ubicacion/eliminar/{id}")
    public String eliminarUbicacion(@PathVariable Long id) {
        ubicacionService.eliminarUbicacion(id);
        return "La ubicacion fue eliminada exitosamente";
    }

    @GetMapping("ubicacion/traer")
    public List<Ubicacion> listaUbicaciones() {
        return ubicacionService.listaUbicaciones();
    }

    @PutMapping("ubicacion/editar/{id}")
    public Ubicacion editarUbicacion(@PathVariable Long id,
                                                    @RequestParam ("nombre") String nuevoNombre) {
        Ubicacion ubicacion = ubicacionService.encontrarUbicacion(id);
        ubicacion.setNombre(nuevoNombre);
        ubicacionService.crearUbicacion(ubicacion);
        return ubicacion;

    }

}
