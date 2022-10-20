
package com.portfolio.EmilioJerez.Controlador;

import com.portfolio.EmilioJerez.modelo.Habilidades;
import com.portfolio.EmilioJerez.servicio.HabilidadesServicio;
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
public class HabilidadesControlador {
   
    @Autowired
    private HabilidadesServicio habilServ;
    
    @GetMapping("/portfolio/habilidades")
    public  List<Habilidades> verTodasHabilidades(){
        
        return habilServ.verTodasHabilidades();
    }
    
    @GetMapping("/portfolio/habilidades/{id}")
    public Habilidades verUnExperiencia(@PathVariable Long id){
         return habilServ.verHabilidadesId(id);
    }
    
    @PostMapping("/portfolio/habilidades/crear")
    public Habilidades crearExperiencia(@RequestBody Habilidades habilidades){
        return habilServ.crearHabilidades(habilidades);
    }
    
    @PutMapping("/portfolio/habiliades/editar")
    public Habilidades actualizarHabilidades (@RequestBody Habilidades habilidades){
        
        return habilServ.editarHabilidades(habilidades);
 }
    @DeleteMapping("/portfolio/habilidades/borrar/{id}")
        public void borrarEstudio( @PathVariable Long id){
            habilServ.borrarHabilidadesId(id);
    }
}