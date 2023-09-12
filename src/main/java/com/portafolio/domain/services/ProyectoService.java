package com.portafolio.domain.services;

import com.portafolio.domain.models.Proyecto;
import com.portafolio.infrarepositories.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProyectoService {
    private final ProyectoRepository proyectoRepository;

    @Autowired

    public ProyectoService(ProyectoRepository proyectoRepository) {

        this.proyectoRepository = proyectoRepository;
    }

    public List<Proyecto> getProyecto() {
        return proyectoRepository.findAll();
    }

    public void newProyecto(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }

    public void update(Integer id, Proyecto proyecto) {

        Optional<Proyecto> proyectoByID = (proyectoRepository.findById(id));

        if (proyectoByID.isPresent()) {
            Proyecto proyectoExistente = proyectoByID.get();

            proyectoExistente.setNombre(proyecto.getNombre());
            proyectoExistente.setDescripcion(proyecto.getDescripcion());
            proyectoExistente.setImg(proyecto.getImg());
            proyectoExistente.setRepositorio(proyecto.getRepositorio());
            proyectoExistente.setColaboradores(proyecto.getColaboradores());
            proyectoExistente.setTecnologias(proyecto.getTecnologias());

            proyectoRepository.save(proyectoExistente);
        }
    }

    public void deleteProyecto(Integer id, Proyecto proyecto) {
        boolean existe = proyectoRepository.existsById(id);
        if (existe) {
            proyectoRepository.delete(proyecto);
        }
    }
}