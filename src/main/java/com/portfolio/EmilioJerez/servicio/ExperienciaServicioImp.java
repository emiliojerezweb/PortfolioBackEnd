
package com.portfolio.EmilioJerez.servicio;

import com.portfolio.EmilioJerez.modelo.Experiencia;
import com.portfolio.EmilioJerez.repositorio.ExperienciaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaServicioImp implements ExperienciaServicio {
    
    @Autowired
    private ExperienciaRepositorio expRepo;

    @Override
    public List<Experiencia> verTodasExperiencias() {
        return expRepo.findAll();
    }

    @Override
    public Experiencia verExpPorId(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarExpPorId(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia editarExperiencia(Experiencia experiencia) {
        return expRepo.save(experiencia);
    }

    @Override
    public Experiencia crearExperiencia(Experiencia experiencia) {
       return expRepo.save(experiencia);
    }


    
}
