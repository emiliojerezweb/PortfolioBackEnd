
package com.portfolio.EmilioJerez.repositorio;

import com.portfolio.EmilioJerez.modelo.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepositorio extends JpaRepository<Experiencia, Long>{
    
}
