
package com.portfolio.EmilioJerez.servicio;

import com.portfolio.EmilioJerez.modelo.Habilidades;
import com.portfolio.EmilioJerez.repositorio.HabilidadRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesServicioImp implements HabilidadesServicio {

    @Autowired
    private HabilidadRepositorio habilRepo; 
    
    @Override
    public List<Habilidades> verTodasHabilidades() {
       return  habilRepo.findAll();
    }

    @Override
    public Habilidades verHabilidadesId(Long id) {
      return habilRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarHabilidadesId(Long id) {
      habilRepo.deleteById(id);
    }

    @Override
    public Habilidades editarHabilidades(Habilidades habilidades) {
       return  habilRepo.save(habilidades);
    }

    @Override
    public Habilidades crearHabilidades(Habilidades habilidades) {
       return habilRepo.save(habilidades);
    }
    
}
