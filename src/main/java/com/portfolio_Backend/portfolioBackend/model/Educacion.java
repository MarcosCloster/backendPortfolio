
package com.portfolio_Backend.portfolioBackend.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String imagen;
    private String nombre;
    private String informacion;
    private String anios;
    private Long id;

    public Educacion() {
    }

    public Educacion(String imagen, String nombre, String informacion, String anios, Long id) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.informacion = informacion;
        this.anios = anios;
        this.id = id;
    }

    
    
    
    
    
}
