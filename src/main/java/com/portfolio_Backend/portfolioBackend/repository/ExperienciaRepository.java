
package com.portfolio_Backend.portfolioBackend.repository;

import com.portfolio_Backend.portfolioBackend.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long>{
    
}
