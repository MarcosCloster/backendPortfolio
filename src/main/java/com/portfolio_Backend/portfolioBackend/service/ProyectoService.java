
package com.portfolio_Backend.portfolioBackend.service;

import com.portfolio_Backend.portfolioBackend.model.Proyecto;
import com.portfolio_Backend.portfolioBackend.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class ProyectoService implements IProyectoService{

    @Autowired
    public ProyectoRepository proyRepo;
    
    @Override
    public List<Proyecto> verProyecto() {
        return proyRepo.findAll();
    }

    @Override
    public void agregarProyecto(Proyecto proy) {
        proyRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyRepo.deleteById(id);
    }
    
}
