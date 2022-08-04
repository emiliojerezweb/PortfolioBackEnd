/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.EmilioJerez.Controlador;

import com.portfolio.EmilioJerez.modelo.Persona;
import com.portfolio.EmilioJerez.servicio.PersonaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaControlador {
    
    @Autowired
    private PersonaServicio persoServ;
    
    @GetMapping("/portfolio")
    public List<Persona> verDatos(){
        return persoServ.verPersona();
    }
//Para guardar modificaciones en persona
    @PutMapping("/portfolio/editar")
    public void hacerCambio(@RequestBody Persona perso){
        Persona persoNuevo = new Persona();
        
        persoNuevo.setNombre(perso.getNombre());
        persoNuevo.setApellido(perso.getApellido());
        persoNuevo.setTelefono(perso.getTelefono());
        persoNuevo.setEmail(perso.getEmail());
        
        persoServ.guardarPersona(persoNuevo);
        
     
        
    }
    
}
