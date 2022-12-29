
package com.portafolio.BackEnd.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String titulo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String logo;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PERSONA")
    private Persona persona;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_DIRECCION")
    private Ubicacion ubicacion;

    public Educacion() {
    }

    public Educacion(String nombre, String titulo, LocalDate fechaInicio, LocalDate fechaFin, String logo, Persona persona, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.logo = logo;
        this.persona = persona;
        this.ubicacion = ubicacion;
    }
    
    
    
}
