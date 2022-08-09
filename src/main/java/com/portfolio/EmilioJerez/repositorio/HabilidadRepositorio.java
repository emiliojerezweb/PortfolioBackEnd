
package com.portfolio.EmilioJerez.repositorio;

import com.portfolio.EmilioJerez.modelo.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepositorio extends JpaRepository <Habilidades, Long>{
    
}
