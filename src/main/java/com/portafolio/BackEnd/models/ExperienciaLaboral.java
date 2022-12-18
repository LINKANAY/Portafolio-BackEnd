package com.portafolio.BackEnd.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    @JsonFormat(pattern = "dd-MM-YYYY")
    private Date fechaInicio;
    @JsonFormat(pattern = "dd-MM-YYYY")
    private Date fechaFin;
    private List<String> tareas;
    private String logo;
    
}
