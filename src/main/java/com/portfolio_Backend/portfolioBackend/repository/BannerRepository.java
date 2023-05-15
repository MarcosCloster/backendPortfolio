
package com.portfolio_Backend.portfolioBackend.repository;

import com.portfolio_Backend.portfolioBackend.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerRepository extends JpaRepository <Banner, Long>{
    
}
