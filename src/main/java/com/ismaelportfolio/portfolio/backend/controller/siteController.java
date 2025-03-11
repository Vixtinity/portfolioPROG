package com.ismaelportfolio.portfolio.backend.controller;

import com.ismaelportfolio.portfolio.backend.model.Habilidades;
import com.ismaelportfolio.portfolio.backend.model.Habilidades.Idioma;
import com.ismaelportfolio.portfolio.backend.model.Index;
import com.ismaelportfolio.portfolio.backend.model.Proyecto;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class siteController {

    @GetMapping("/")
    public String mostrarInicio(Model model) {
        Index usuario = new Index(
            "Ismael Fernández López", 
            18, 
            "¡Hola! Soy un joven de 18 años apasionado por la tecnología y el desarrollo web. Actualmente estoy cursando el primer año de Desarrollo de Aplicaciones Web (DAW). En este curso, he trabajado con tecnologías como HTML, CSS, Java, entre otras. A través de este portfolio, quiero mostrar mis proyectos y el progreso que voy realizando, a medida que me adentro en el mundo del desarrollo web.", 
            "imagenes/curriculum.pdf", 
            "PRYS", 
            "www.prys.es", 
            2022
        );

        model.addAttribute("usuario", usuario);
        return "index";
    }
    @GetMapping("/habilidad")
    public String mostrarHabilidad(Model model) {
        List<String> lenguajesAprendidos = Arrays.asList("HTML", "CSS");
        List<String> lenguajesEnAprendizaje = Arrays.asList("Java", "MySQL");
        List<Idioma> idiomas = Arrays.asList(
                new Idioma("Español", "Nativo"),
                new Idioma("Inglés", "Intermedio")
        );

        // Crear el objeto de habilidades
        Habilidades habilidades = new Habilidades(lenguajesAprendidos, lenguajesEnAprendizaje, idiomas);

        // Agregar al modelo
        model.addAttribute("habilidades", habilidades);

        return "habilidad";
    }

        @GetMapping("/proyectos")
        public String mostrarProyectos(Model model) {
            Proyecto proyecto1 = new Proyecto("Página sobre Cowboy Bebop", "Página simple que hice en Google Sites durante el grado medio.",
                                            "https://sites.google.com/view/bebopsmr1?usp=sharing", 
                                            null,
                                            Arrays.asList("/imagenes/proyecto2.jpg", "/imagenes/proyecto2-2.jpg", "/imagenes/proyecto2-3.jpg"));
        
            // Agregar los proyectos al modelo con los nombres proyecto1 y proyecto2
            model.addAttribute("proyecto1", proyecto1);
            return "proyectos";
        }
        


    @GetMapping("/contacto")
    public String mostrarContacto() {
        return "contacto";
    }
}
