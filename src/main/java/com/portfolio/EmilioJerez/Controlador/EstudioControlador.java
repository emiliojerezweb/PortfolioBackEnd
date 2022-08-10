
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
@CrossOrigin( origins =  "http://localhost:4200")
public class EstudioControlador {
    
    @Autowired
    private EstudioServicio estudioServ;
    
    @GetMapping("/portfolio/estudio")
    public  List<Estudios> verTodosEstudios(){
        
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
    
    @PutMapping("/portfolio/estudio/editar/{id}")
    public Estudios actualizoEstudio (@RequestBody Estudios estudio, @PathVariable Long id){
        
        Estudios estudioNuevo = new Estudios();
         
        verUnEstudio(id);
        estudioNuevo.setTitulo(estudio.getTitulo());
        estudioNuevo.setInstitucuion(estudio.getInstitucuion());
        estudioNuevo.setAnio_inicio(estudio.getAnio_inicio());
        estudioNuevo.setAnio_fin(estudio.getAnio_fin());
        
        return estudioServ.editarEstudio(estudioNuevo, id);
        
    }
@DeleteMapping("/portfolio/estudio/borrar/{id}")
public void borrarEstudio(@RequestBody Estudios estudio, Long id){
        verUnEstudio(id);
        estudioServ.borrarEstudioId(id);
}
}
