
package com.portfolio_Backend.portfolioBackend.service;

import com.portfolio_Backend.portfolioBackend.model.AcercaDe;
import java.util.List;

public interface IAcercaDeService {
    
    public List<AcercaDe> verAcercaDe();
    public void agregarAcerDe (AcercaDe acerca);
    public void borrarAcercaDe (Long id);
    
}
