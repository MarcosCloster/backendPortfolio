
package com.portfolio_Backend.portfolioBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String skill;
    private int porcentaje;
    private Long id;

    public Skills() {
    }

    public Skills(String skill, int porcentaje, Long id) {
        this.skill = skill;
        this.porcentaje = porcentaje;
        this.id = id;
    }

    
    
    
    
}
