
package com.portfolio_Backend.portfolioBackend.service;

import com.portfolio_Backend.portfolioBackend.model.Banner;
import com.portfolio_Backend.portfolioBackend.repository.BannerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerService implements IBannerService{
    @Autowired
    public BannerRepository bannerRepo;
    
    @Override
    public List<Banner> verBanner() {
        return bannerRepo.findAll();
    }

    @Override
    public void agregarBanner(Banner banner) {
        bannerRepo.save(banner);
    }

    @Override
    public void borrarBanner(Long id) {
        bannerRepo.deleteById(id);
    }
}
