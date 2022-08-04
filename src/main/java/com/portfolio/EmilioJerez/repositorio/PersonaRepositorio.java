
package com.portfolio.EmilioJerez.repositorio;

import com.portfolio.EmilioJerez.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long>{
        
    
    
}
