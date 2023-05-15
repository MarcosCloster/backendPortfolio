
package com.portfolio_Backend.portfolioBackend.service;

import com.portfolio_Backend.portfolioBackend.model.Banner;
import java.util.List;

public interface IBannerService {
    
    public List<Banner> verBanner();
    public void agregarBanner (Banner banner);
    public void borrarBanner (Long id);
}
