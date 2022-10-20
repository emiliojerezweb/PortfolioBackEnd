
package com.portfolio.EmilioJerez.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table (name="habilidad")
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nombre;

    public Habilidades() {
    }

    public Habilidades(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
 
}
