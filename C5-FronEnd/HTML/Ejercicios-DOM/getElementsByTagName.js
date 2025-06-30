//🧪 Ejercicio 1: Cambiar el color de todos los párrafos
// Objetivo: seleccionar todos los elementos <p> y cambiar su color a azul.
const parrafos = document.getElementsByTagName("p");
for (let i = 0; i < parrafos.length; i++) {
  parrafos[i].style.color = "blue";
}

// 🧪 Ejercicio 2: Contar cuántas imágenes hay en la página
// Objetivo: mostrar por consola cuántas etiquetas <img> hay.

const imagenes = document.getElementsByTagName("img");
console.log("Número de imágenes:", imagenes.length);

// 🧪 Ejercicio 3: Cambiar el texto de todos los botones
// Objetivo: cambiar el texto de cada <button> a "¡Clic aquí!"

const botones = document.getElementsByTagName("button");
for (let i = 0; i < botones.length; i++) {
  botones[i].innerText = "¡Clic aquí!";
}