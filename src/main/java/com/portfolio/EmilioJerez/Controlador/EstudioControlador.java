
package com.portfolio.EmilioJerez.Controlador;

import com.portfolio.EmilioJerez.modelo.Estudios;
import com.portfolio.EmilioJerez.servicio.EstudioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudioControlador {
    
    @Autowired
    private EstudioServicio estudioServ;
    
    @GetMapping("/portfolio/estudio")
    public  List<Estudios> verTotalEstudios(){
        
        return estudioServ.verTodosEstudios();
    }
    
    @GetMapping("/portfolio/estudio/{id}")
    public Estudios verUnEstudio(@PathVariable Long id){
         return estudioServ.verEstudiosId(id);
    }
    
    @PostMapping("/portfolio/estudio/crear")
    public Estudios crearEstudio(@RequestBody Estudios estudio){
        return estudioServ.crearEstudio(estudio);
    }
    
    @PutMapping("/portfolio/estudio/editar")
    public Estudios actualizarEstudio (@RequestBody Estudios estudio){
        
        return estudioServ.crearEstudio(estudio);
 }
    @DeleteMapping("/portfolio/estudio/borrar/{id}")
        public void borrarEstudio( @PathVariable Long id){
            estudioServ.borrarEstudioId(id);
    }
}