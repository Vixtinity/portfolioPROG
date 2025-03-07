// Volver arriba de manera fluida
const botonArriba = document.querySelector('footer a[href="#"]');
if (botonArriba) {
    botonArriba.addEventListener("click", (event) => {
        event.preventDefault();
        window.scrollTo({ top: 0, behavior: "smooth" });
    });
}

// FUNCIONES PARA EL NAV
const menuLinks = document.querySelectorAll('#menu ul li a');

// Agregar un evento a cada enlace
menuLinks.forEach(link => {
    link.addEventListener('mouseenter', () => {
        link.style.transform = 'scale(1.2)';
        link.style.transition = 'transform 0.6s ease';
    });

    link.addEventListener('mouseleave', () => {
        link.style.transform = 'scale(1)';
    });

    link.addEventListener('click', (event) => {
        // Agregar animación al hacer clic
        // preventDefault hace que la página no se recargue al momento.
        event.preventDefault();
        link.style.color = '#6F5F6F';

        // Agregar el efecto de desvanecimiento antes de redirigir
        document.body.style.transition = 'opacity 0.6s ease';
        document.body.style.opacity = 0;

        // Esto crea un delay de 300 ms antes de ir a la pagina
        setTimeout(() => {
            window.location.href = link.href;
        }, 600);
    });
});

window.addEventListener('beforeunload', () => {
    document.body.style.transition = 'opacity 0.6s ease';
    document.body.style.opacity = 0;
});
document.querySelector(".menu-toggle").addEventListener("click", function() {
    document.querySelector("#menu ul").classList.toggle("show");
});

document.addEventListener("DOMContentLoaded", function () {
    const botonPrys = document.getElementById("prysboton");
    const mapaContainer = document.getElementById("ma   pa-container");

    botonPrys.addEventListener("mouseover", function () {
        mapaContainer.style.maxHeight = "200px";
    });

    botonPrys.addEventListener("mouseout", function () {
        mapaContainer.style.maxHeight = "0px";
    });
});


