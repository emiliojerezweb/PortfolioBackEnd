/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.EmilioJerez.servicio;

import com.portfolio.EmilioJerez.modelo.Persona;
import java.util.List;


public interface PersonaServicio {
    
    public List<Persona> verPersona();
    
    public void guardarPersona(Persona perso);
}
