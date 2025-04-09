// que cuando le demos al button ejecute un un mensaje alert

// Esperar a que el documento esté completamente cargado
document.addEventListener("DOMContentLoaded", () => {
    // Seleccionar elementos del DOM
    const boton = document.getElementById("boton");
    const titulo = document.querySelector("h1");

    // Añadir evento al botón
    boton.addEventListener("click", () => {
        console.log("Botón clicado");
        titulo.textContent = "¡Gracias por hacer clic!";
        boton.disabled = true; // Deshabilitar el botón tras pulsarlo
    });
});
