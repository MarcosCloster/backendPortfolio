
package com.portfolio_Backend.portfolioBackend.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nombreProyecto;
    private String descripcion;
    private String fotos;
    private Long id;

    public Proyecto() {
    }

    public Proyecto(String nombreProyecto, String descripcion, String fotos, Long id) {
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.fotos = fotos;
        this.id = id;
    }

    
    
    
    
}
