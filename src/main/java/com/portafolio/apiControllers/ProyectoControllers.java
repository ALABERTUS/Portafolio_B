package com.portafolio.apiControllers;

import com.portafolio.domain.models.Proyecto;
import com.portafolio.domain.services.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5174")
@RestController
@RequestMapping(path = "api/v1/portafolio")

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
    public void createProyecto(@RequestBody Proyecto proyecto){
        proyectoService.newProyecto(proyecto);
    }

    @PutMapping("/{id}")
    public void updateProyecto(@PathVariable Integer id, @RequestBody Proyecto proyecto ){
        proyectoService.update(id, proyecto);
    }
}

