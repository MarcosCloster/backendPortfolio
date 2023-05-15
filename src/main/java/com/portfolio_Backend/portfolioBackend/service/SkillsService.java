
package com.portfolio_Backend.portfolioBackend.service;

import com.portfolio_Backend.portfolioBackend.model.Skills;
import com.portfolio_Backend.portfolioBackend.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService{

    @Autowired
    public SkillsRepository skillRepo;
    
    @Override
    public List<Skills> verSkills() {
        return skillRepo.findAll();
    }

    @Override
    public void agregarSkills(Skills skill) {
        skillRepo.save(skill);
    }

    @Override
    public void borrarSkills(Long id) {
        skillRepo.deleteById(id);
    }
    
}
