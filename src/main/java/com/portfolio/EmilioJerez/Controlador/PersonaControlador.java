
package com.portfolio.EmilioJerez.Controlador;

import com.portfolio.EmilioJerez.modelo.Persona;
import com.portfolio.EmilioJerez.servicio.PersonaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin( origins =  "http://localhost:4200")
public class PersonaControlador {
    
    @Autowired
    private PersonaServicio persoServ;
    
    @GetMapping("/portfolio")
    public List<Persona> verDatos(){
        return persoServ.verPersona();
    }
    
    
//Para guardar modificaciones en persona
    @PutMapping("/portfolio/editar")
    public Persona hacerCambio(@RequestBody Persona perso){
        
        return persoServ.guardarPersona(perso);
       
    }
    
    
}
