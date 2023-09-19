package com.portafolio.infrarepositories;

import com.portafolio.domain.models.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {
}