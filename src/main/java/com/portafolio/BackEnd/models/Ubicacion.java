
package com.portafolio.BackEnd.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Ubicacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    
    @OneToOne
    private Persona persona;
    
    @OneToOne
    private ExperienciaLaboral experiencia;
    
    @OneToOne
    private Educacion educacion;

    public Ubicacion() {
    }

    public Ubicacion(String nombre, Persona persona) {
        this.nombre = nombre;
        this.persona = persona;
    }
    
    public Ubicacion(String nombre, ExperienciaLaboral experienciaLaboral) {
        this.nombre = nombre;
        this.experiencia = experienciaLaboral;
    }
    
    public Ubicacion(String nombre, Educacion educacion) {
        this.nombre = nombre;
        this.educacion = educacion;
    }
    
    
}
