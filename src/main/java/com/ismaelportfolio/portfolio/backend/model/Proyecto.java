package com.ismaelportfolio.portfolio.backend.model;

import java.util.List;

public class Proyecto {
    private String nombre;
    private String descripcion;
    private String url;
    private List<String> imagenes;

    // Constructor
    public Proyecto(String nombre, String descripcion, String url, String videoUrl, List<String> imagenes) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url = url;
        this.imagenes = imagenes;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<String> imagenes) {
        this.imagenes = imagenes;
    }
}
