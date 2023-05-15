
package com.portfolio_Backend.portfolioBackend.repository;

import com.portfolio_Backend.portfolioBackend.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long>{
    
}
