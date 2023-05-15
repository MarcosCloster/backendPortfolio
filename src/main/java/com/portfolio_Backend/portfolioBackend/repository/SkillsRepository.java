
package com.portfolio_Backend.portfolioBackend.repository;

import com.portfolio_Backend.portfolioBackend.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository <Skills, Long>{
    
}
