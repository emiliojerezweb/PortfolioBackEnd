
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
@Setter @Getter
@Table (name="estudio")
public class Estudios {
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String titulo;
    private String institucuion;
    private String anio_inicio;
    private String anio_fin;
        
    public Estudios() {
    }

    public Estudios(Long id, String titulo, String institucuion, String anio_inicio, String anio_fin) {
        this.id = id;
        this.titulo = titulo;
        this.institucuion = institucuion;
        this.anio_inicio = anio_inicio;
        this.anio_fin = anio_fin;
    }
    
    
}
