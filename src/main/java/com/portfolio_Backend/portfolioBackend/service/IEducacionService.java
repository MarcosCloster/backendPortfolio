
package com.portfolio_Backend.portfolioBackend.service;

import com.portfolio_Backend.portfolioBackend.model.Educacion;
import java.util.List;

public interface IEducacionService{
    
    public List<Educacion> verEducacion();
    public void agregarEducacion (Educacion educa);
    public void borrarEducacion (Long id);
    
}
