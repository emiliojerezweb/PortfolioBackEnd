
package com.portfolio.EmilioJerez.servicio;

import com.portfolio.EmilioJerez.modelo.Habilidades;
import java.util.List;


public interface HabilidadesServicio {
    
      public List<Habilidades> verTodasHabilidades();
   
    public Habilidades verHabilidadesId(Long id);
    
    public void borrarHabilidadesId(Long id);
    
    public Habilidades editarHabilidades(Habilidades  habilidades);
    
    public Habilidades crearHabilidades(Habilidades habilidades);
}
