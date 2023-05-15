
package com.portfolio_Backend.portfolioBackend.service;

import com.portfolio_Backend.portfolioBackend.model.Educacion;
import com.portfolio_Backend.portfolioBackend.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    public EducacionRepository educaRepo;

    @Override
    public List<Educacion> verEducacion() {
        return educaRepo.findAll();
    }

    @Override
    public void agregarEducacion(Educacion educa) {
        educaRepo.save(educa);
    }

    @Override
    public void borrarEducacion(Long id) {
        educaRepo.deleteById(id);
    }
    
    
   
}
