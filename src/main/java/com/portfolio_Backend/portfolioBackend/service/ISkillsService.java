
package com.portfolio_Backend.portfolioBackend.service;

import com.portfolio_Backend.portfolioBackend.model.Skills;
import java.util.List;

public interface ISkillsService {
    
    public List<Skills> verSkills();
    public void agregarSkills (Skills skill);
    public void borrarSkills (Long id);
    
}
