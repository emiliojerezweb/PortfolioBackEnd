
package com.portfolio.EmilioJerez.repositorio;

import com.portfolio.EmilioJerez.modelo.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepositorio extends JpaRepository<Estudios, Long> {
    
}
