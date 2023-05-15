
package com.portfolio_Backend.portfolioBackend.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String trabajo;
    private Long id;

    public Experiencia() {
    }

    public Experiencia(String trabajo, Long id) {
        this.trabajo = trabajo;
        this.id = id;
    }

    
    
    
    
}
