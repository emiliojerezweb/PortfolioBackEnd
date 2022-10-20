package com.portfolio.EmilioJerez.servicio;

import com.portfolio.EmilioJerez.modelo.Persona;
import com.portfolio.EmilioJerez.repositorio.PersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServicioImp implements PersonaServicio {

    @Autowired
    public PersonaRepositorio persoRepo;

    @Override
    public List<Persona> verPersona() {
        return persoRepo.findAll();
    }

    @Override
    public Persona guardarPersona(Persona persona) {
                return persoRepo.save(persona);
    }
}
