package com.ismaelportfolio.portfolio.controller;

import com.ismaelportfolio.portfolio.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class siteController {

    @GetMapping("/index")
    public String mostrarInicio(Model model) {
        // Crear el usuario con datos estáticos directamente en el Controller
        Usuario usuario = new Usuario();
        usuario.setNombre("Ismael Fernández López");
        usuario.setEdad(18);
        usuario.setDescripcion("¡Hola! Soy un joven de 18 años apasionado por la tecnología y el desarrollo web. Actualmente estoy cursando el primer año de Desarrollo de Aplicaciones Web (DAW). En este curso, he trabajado con tecnologías como HTML, CSS, Java, entre otras. A través de este portfolio, quiero mostrar mis proyectos y el progreso que voy realizando, a medida que me adentro en el mundo del desarrollo web.");
        usuario.setCurriculum("imagenes/curriculum.pdf");
        usuario.setEmpresa("PRYS");
        usuario.setUrlEmpresa("http://www.prys.es/");

        // Agregar el usuario al modelo
        model.addAttribute("usuario", usuario);

        return "index";
    }

    @GetMapping("/habilidad")
    public String mostrarHabilidades() {
        return "habilidad";
    }

    @GetMapping("/proyectos")
    public String mostrarProyectos() {
        return "proyectos";
    }

    @GetMapping("/contacto")
    public String mostrarContacto() {
        return "contacto";
    }
}
