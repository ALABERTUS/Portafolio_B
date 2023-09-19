package com.portafolio.Services;

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
public Proyecto proyectoById(Integer id) {
        Optional<Proyecto> proyectoById = proyectoRepository.findById(id);
        return proyectoById.orElse(null);
}
    public void update(Integer id, Proyecto proyecto) {

            Proyecto proyectoExistente = proyectoById(id);
            if (proyectoExistente == null) {
                System.out.println("error");
            }
            proyectoExistente.setNombre(proyecto.getNombre());
            proyectoExistente.setDescripcion(proyecto.getDescripcion());
            proyectoExistente.setImg(proyecto.getImg());
            proyectoExistente.setRepositorio(proyecto.getRepositorio());
            proyectoExistente.setColaboradores(proyecto.getColaboradores());
            proyectoExistente.setTecnologias(proyecto.getTecnologias());
            proyectoRepository.save(proyectoExistente);

        }


    public void deleteProyecto(Integer id, Proyecto proyecto) {
        boolean existed;
        existed = proyectoRepository.existsById(id);
        if (existed) { proyectoRepository.delete(proyecto);
        }
    }
}
