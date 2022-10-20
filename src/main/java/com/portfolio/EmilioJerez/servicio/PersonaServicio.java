
package com.portfolio.EmilioJerez.servicio;

import com.portfolio.EmilioJerez.modelo.Persona;
import java.util.List;


public interface PersonaServicio {
    
    public List<Persona> verPersona();
    
    public Persona guardarPersona(Persona perso);
}
