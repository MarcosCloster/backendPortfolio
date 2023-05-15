
package com.portfolio_Backend.portfolioBackend.service;

import com.portfolio_Backend.portfolioBackend.model.Experiencia;
import com.portfolio_Backend.portfolioBackend.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public ExperienciaRepository expe;
    
    @Override
    public List<Experiencia> verexperiencia() {
        return expe.findAll();
    }

    @Override
    public void agregarExperiencia(Experiencia Expe) {
        expe.save(Expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expe.deleteById(id);
    }
    
    
    
}
