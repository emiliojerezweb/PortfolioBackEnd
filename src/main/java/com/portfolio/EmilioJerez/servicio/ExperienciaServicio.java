
package com.portfolio.EmilioJerez.servicio;

import com.portfolio.EmilioJerez.modelo.Experiencia;
import java.util.List;

public interface ExperienciaServicio {
    
      public List<Experiencia> verTodasExperiencias();
   
    public Experiencia verExpPorId(Long id);
    
    public void borrarExpPorId(Long id);
    
    public Experiencia editarExperiencia(Experiencia  experiencia);
    
    public Experiencia crearExperiencia(Experiencia experiencia);
}
