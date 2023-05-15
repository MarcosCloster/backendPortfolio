
package com.portfolio_Backend.portfolioBackend.service;


import com.portfolio_Backend.portfolioBackend.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    public List<Proyecto> verProyecto();
    public void agregarProyecto (Proyecto proy);
    public void borrarProyecto (Long id);
}
