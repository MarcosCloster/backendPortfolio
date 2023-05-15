
package com.portfolio_Backend.portfolioBackend.repository;

import com.portfolio_Backend.portfolioBackend.model.AcercaDe;
import com.portfolio_Backend.portfolioBackend.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long>{
    
}
