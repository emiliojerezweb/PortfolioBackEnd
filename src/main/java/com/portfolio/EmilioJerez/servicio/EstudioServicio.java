
package com.portfolio.EmilioJerez.servicio;

import com.portfolio.EmilioJerez.modelo.Estudios;
import java.util.List;


public interface EstudioServicio {
    
    public List<Estudios> verTodosEstudios();
   
    public Estudios verEstudiosId(Long id);
    
    public void borrarEstudioId(Long id);
    
    public Estudios editarEstudio(Estudios  estudio);
    
    public Estudios crearEstudio(Estudios estudio);
    
}
