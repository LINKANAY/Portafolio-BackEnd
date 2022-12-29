
package com.portafolio.BackEnd.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String skill;
    private double porcentaje;
    private String logo;
   
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PERSONA")
    private Persona persona;

    public Skill() {
    }

    public Skill(String skill, double porcentaje, String logo, Persona persona) {
        this.skill = skill;
        this.porcentaje = porcentaje;
        this.logo = logo;
        this.persona = persona;
    }
    
    
    
}
