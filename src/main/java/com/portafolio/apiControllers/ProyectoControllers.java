package com.proyecto.apiControllers;

import com.portafolio.domain.models.Proyecto;
import com.proyectospringbootpostgresjpa.domain.models.Proyecto;
import com.proyectospringbootpostgresjpa.domain.services.ProyectoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/proyecto")

public class ProyectoControllers {
    private final ProyectoService proyectoService;

    @Autowired

    public ProyectoControllers(ProyectoService proyectoService) {

        this.proyectoService = proyectoService;
    }

    @GetMapping
    public List<Proyecto> getProyectoController(){
        return proyectoService.getProyecto();
    }

    @PostMapping
    public void createBook(@RequestBody Proyecto proyecto){
        proyectoService.newProyecto(proyecto);
    }

    @PutMapping("/{id}")
    public void updateProyecto(@PathVariable Integer id, @RequestBody Proyecto proyecto ){
        proyectoService.update(id, proyecto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id, Proyecto proyecto){
        proyectoService.deleteProyecto(id, libro);
    }

}
}
