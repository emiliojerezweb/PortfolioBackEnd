/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.EmilioJerez.servicio;

import com.portfolio.EmilioJerez.modelo.Estudios;
import com.portfolio.EmilioJerez.repositorio.EstudioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioServicioImp implements EstudioServicio {

    @Autowired
   public  EstudioRepositorio EstuRepo;
    @Override
    public List<Estudios> verTodosEstudios() {
           return  EstuRepo.findAll();
   }

    @Override
    public Estudios verEstudiosId(Long id) {
        return EstuRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarEstudioId(Long id) {
       EstuRepo.deleteById(id);
    }

    @Override
    public Estudios editarEstudio(Estudios estudio, Long id){
        
        return EstuRepo.save(estudio);
    }

    @Override
    public Estudios crearEstudio(Estudios estudio) {
         return EstuRepo.save(estudio);
    }
    
} 