document.getElementById('hamburguesa').addEventListener('click', function() {
    document.getElementById('menu').classList.toggle('open');
});

// Agregar un evento a cada enlace
const menuLinks = document.querySelectorAll('#menu a');
menuLinks.forEach(link => {
    link.addEventListener('mouseenter', () => {
        link.style.transform = 'scale(1.2)';
        link.style.transition = 'transform 0.6s ease';
    });

    link.addEventListener('mouseleave', () => {
        link.style.transform = 'scale(1)';
    });

    link.addEventListener('click', (event) => {
        event.preventDefault();
        link.style.color = '#6F5F6F';

        document.body.style.transition = 'opacity 0.6s ease';
        document.body.style.opacity = 0;

        setTimeout(() => {
            window.location.href = link.href;
        }, 600);
    });
});

// Desaparece poco a poco la pagina al ir a otra
window.addEventListener('beforeunload', () => {
    document.body.style.transition = 'opacity 0.6s ease';
    document.body.style.opacity = 0;
});
document.addEventListener("DOMContentLoaded", () => {
    const formulario = document.getElementById("formulario-contacto");
    const botonEnviar = document.getElementById("enviar");

    formulario.addEventListener("submit", (event) => {
        event.preventDefault();


        const nombre = document.getElementById("nombre").value;
        const email = document.getElementById("email").value;
        const mensaje = document.getElementById("mensaje").value;

        console.log("Nombre:", nombre);
        console.log("Email:", email);
        console.log("Mensaje:", mensaje);

        alert("Formulario enviado exitosamente. ¡Gracias por tu mensaje!");

        formulario.reset();
    });
});
