
package com.portfolio_Backend.portfolioBackend.Controller;

import com.portfolio_Backend.portfolioBackend.model.AcercaDe;
import com.portfolio_Backend.portfolioBackend.service.IAcercaDeService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
   
    @Autowired
    private IAcercaDeService acercaServ;
    
   @PostMapping ("/new/acercade/")
   public void agregarAcerca (AcercaDe acerca){
       acercaServ.agregarAcerDe(acerca);
   }
   @GetMapping ("/ver/acercade/")
   @ResponseBody
   public List<AcercaDe> verAcercaDe (){
        return acercaServ.verAcercaDe();
   }
   
   @DeleteMapping ("/delete/(id)/")
   public void borrarAcercaDe (Long id){
       acercaServ.borrarAcercaDe(id);
   }
    
}
