
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
@Table (name="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String direccion;
    private String descripcion;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String telefono, String email, String direccion, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.descripcion = descripcion;
    }
    
    
}


