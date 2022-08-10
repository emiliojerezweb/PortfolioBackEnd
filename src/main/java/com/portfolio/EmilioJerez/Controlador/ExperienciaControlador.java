
package com.portfolio.EmilioJerez.Controlador;

import com.portfolio.EmilioJerez.modelo.Experiencia;
import com.portfolio.EmilioJerez.servicio.ExperienciaServicio;
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
public class ExperienciaControlador {
    
    @Autowired
    private ExperienciaServicio expServ;
    
    @GetMapping("/portfolio/experiencia")
    public  List<Experiencia> verTotalExperiencias(){
        
        return expServ.verTodasExperiencias();
    }
    
    @GetMapping("/portfolio/experiencia/{id}")
    public Experiencia verUnExperiencia(@PathVariable Long id){
         return expServ.verExpPorId(id);
    }
    
    @PostMapping("/portfolio/experiencia/crear")
    public Experiencia crearExperiencia(@RequestBody Experiencia exp){
        return expServ.crearExperiencia(exp);
    }
    
    @PutMapping("/portfolio/estudio/editar")
    public Experiencia actualizarEstudio (@RequestBody Experiencia exp){
        
        return expServ.crearExperiencia(exp);
 }
    @DeleteMapping("/portfolio/estudio/borrar/{id}")
        public void borrarEstudio( @PathVariable Long id){
            expServ.borrarExpPorId(id);
    }
}
