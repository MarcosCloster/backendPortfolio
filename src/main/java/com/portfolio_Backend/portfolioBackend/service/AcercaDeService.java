
package com.portfolio_Backend.portfolioBackend.service;

import com.portfolio_Backend.portfolioBackend.model.AcercaDe;
import com.portfolio_Backend.portfolioBackend.repository.AcercaDeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaDeService implements IAcercaDeService{

    @Autowired
    public AcercaDeRepository acercaRepo;
    
    @Override
    public List<AcercaDe> verAcercaDe() {
        return acercaRepo.findAll();
    }

    @Override
    public void agregarAcerDe(AcercaDe acerca) {
        acercaRepo.save(acerca);
    }

    @Override
    public void borrarAcercaDe(Long id) {
        acercaRepo.deleteById(id);
    }

    
}
