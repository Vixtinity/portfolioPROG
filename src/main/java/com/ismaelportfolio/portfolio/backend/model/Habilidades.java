package com.ismaelportfolio.portfolio.backend.model;

import java.util.List;

public class Habilidades {

    private List<String> lenguajesAprendidos;
    private List<String> lenguajesEnAprendizaje;
    private List<Idioma> idiomas;

    public Habilidades(List<String> lenguajesAprendidos, List<String> lenguajesEnAprendizaje, List<Idioma> idiomas) {
        this.lenguajesAprendidos = lenguajesAprendidos;
        this.lenguajesEnAprendizaje = lenguajesEnAprendizaje;
        this.idiomas = idiomas;
    }

    public List<String> getLenguajesAprendidos() {
        return lenguajesAprendidos;
    }

    public void setLenguajesAprendidos(List<String> lenguajesAprendidos) {
        this.lenguajesAprendidos = lenguajesAprendidos;
    }

    public List<String> getLenguajesEnAprendizaje() {
        return lenguajesEnAprendizaje;
    }

    public void setLenguajesEnAprendizaje(List<String> lenguajesEnAprendizaje) {
        this.lenguajesEnAprendizaje = lenguajesEnAprendizaje;
    }

    public List<Idioma> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<Idioma> idiomas) {
        this.idiomas = idiomas;
    }

    public static class Idioma {
        private String nombre;
        private String nivel;

        public Idioma(String nombre, String nivel) {
            this.nombre = nombre;
            this.nivel = nivel;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNivel() {
            return nivel;
        }

        public void setNivel(String nivel) {
            this.nivel = nivel;
        }
    }
}
