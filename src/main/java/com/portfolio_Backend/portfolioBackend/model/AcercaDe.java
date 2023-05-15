
package com.portfolio_Backend.portfolioBackend.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class AcercaDe {
    
    
    
    private String nombre;
    private String info;
    private String ubicacion;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    public AcercaDe() {
    }

    public AcercaDe(String nombre, String info, String ubicacion) {
        this.nombre = nombre;
        this.info = info;
        this.ubicacion = ubicacion;
    }

    
    
    
    
}
