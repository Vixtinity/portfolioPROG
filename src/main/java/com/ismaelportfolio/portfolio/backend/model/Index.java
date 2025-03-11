package com.ismaelportfolio.portfolio.backend.model;

import java.time.LocalTime;
import java.time.Year;

public class Index {
    private String nombre;
    private int edad;
    private String descripcion;
    private String curriculum;
    private String empresa;
    private String urlEmpresa;

    public Index(String nombre, int edad, String descripcion, String curriculum, String empresa, String urlEmpresa, int añoInicio) {
        this.nombre = nombre;
        this.edad = edad;
        this.descripcion = descripcion;
        this.curriculum = curriculum;
        this.empresa = empresa;
        this.urlEmpresa = urlEmpresa.startsWith("http") ? urlEmpresa : "https://" + urlEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getUrlEmpresa() {
        return urlEmpresa;
    }
}
