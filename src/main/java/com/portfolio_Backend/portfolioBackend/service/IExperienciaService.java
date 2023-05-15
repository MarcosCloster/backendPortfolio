
package com.portfolio_Backend.portfolioBackend.service;


import com.portfolio_Backend.portfolioBackend.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> verexperiencia();
    public void agregarExperiencia (Experiencia Expe);
    public void borrarExperiencia (Long id);
    
}
