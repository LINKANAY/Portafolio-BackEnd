
package com.portafolio.BackEnd.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String sobreMi;
    private String email;
    private String titulo;
    private String foto;
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    private Set<Educacion> estudios = new HashSet<>();
    
    @OneToMany (mappedBy = "persona", cascade = CascadeType.ALL)
    private Set<ExperienciaLaboral> experiencias = new HashSet<>();
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_DIRECCION")
    private Ubicacion ubicacion;
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    private Set<Skill> habilidades = new HashSet<>();

    public Persona() {
    }

    public Persona(String nombre, String apellido, String sobreMi, String email, String titulo, String foto, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sobreMi = sobreMi;
        this.email = email;
        this.titulo = titulo;
        this.foto = foto;
        this.ubicacion = ubicacion;
    }
    
    
    
    
    
}
