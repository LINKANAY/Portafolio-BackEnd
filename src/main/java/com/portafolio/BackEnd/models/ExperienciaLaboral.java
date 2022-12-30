package com.portafolio.BackEnd.models;

import com.fasterxml.jackson.annotation.JsonFormat;
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
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ExperienciaLaboral {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String cargo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fechaInicio;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate fechaFin;
    private List<String> tareas;
    private String logo;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PERSONA")
    private Persona persona;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_DIRECCION")
    private Ubicacion ubicacion;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(String nombre, String cargo, String fechaInicio, String fechaFin, List<String> tareas, String logo, Persona persona, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.fechaInicio = LocalDate.parse(fechaInicio);
        this.fechaFin = LocalDate.parse(fechaFin);
        this.tareas = tareas;
        this.logo = logo;
        this.persona = persona;
        this.ubicacion = ubicacion;
    }
    
    
    
    
    
}
