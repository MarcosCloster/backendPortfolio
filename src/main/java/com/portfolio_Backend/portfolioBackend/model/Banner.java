
package com.portfolio_Backend.portfolioBackend.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Banner {
    
    
    private String banner;
    private String fotoPerfil;
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    public Banner() {
    }

    public Banner(String banner, String fotoPerfil, Long Id) {
        this.banner = banner;
        this.fotoPerfil = fotoPerfil;
        this.Id = Id;
    }

    

    
    
    
    
}
