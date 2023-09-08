package com.portafolio.domain.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String repositorio;
    private String img;
    private String colaboradores;
    private String lenguajes;
    private String tecnologias;

    public Proyecto() {
    }

    public Proyecto(Integer id, String repositorio, String img, String colaboradores, String lenguajes, String tecnologias) {
        this.id = id;
        this.repositorio = repositorio;
        this.img = img;
        this.colaboradores = colaboradores;
        this.lenguajes = lenguajes;
        this.tecnologias = tecnologias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(String repositorio) {
        this.repositorio = repositorio;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(String colaboradores) {
        this.colaboradores = colaboradores;
    }

    public String getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String lenguajes) {
        this.lenguajes = lenguajes;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }
}


