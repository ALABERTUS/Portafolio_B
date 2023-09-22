package com.portafolio.apiControllers;
import com.portafolio.Services.ProyectoService;
import com.portafolio.domain.models.Proyecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/{id}")
    public ResponseEntity<Proyecto> getProyectoById(@PathVariable Integer id) {
        Proyecto proyecto = proyectoService.proyectoById(id);
        if (proyecto != null ) {
            return ResponseEntity.ok(proyecto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public void createProyecto(@RequestBody Proyecto proyecto){
        proyectoService.newProyecto(proyecto);
    }

    @PutMapping("/{id}")
    public void updateProyecto(@PathVariable Integer id, @RequestBody Proyecto proyecto ){
        proyectoService.update(id, proyecto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id, Proyecto proyecto){
        proyectoService.deleteProyecto(id, proyecto);
    }
}