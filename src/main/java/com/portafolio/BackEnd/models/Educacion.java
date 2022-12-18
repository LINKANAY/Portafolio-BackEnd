
package com.portafolio.BackEnd.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
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
    @JsonFormat(pattern = "dd/MM/YYYY")
    private Date fechaInicio;
    @JsonFormat(pattern = "dd/MM/YYYY")
    private Date fechaFin;
    private String logo;
}
