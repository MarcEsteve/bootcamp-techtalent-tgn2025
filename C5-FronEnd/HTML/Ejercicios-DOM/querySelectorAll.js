//🧪 Ejercicio 1: Cambiar el color (el que más te guste) de todos los párrafos (<p>)

const parrafos = document.querySelectorAll("p");
// const parrafos = document.querySelector("p"); // Solo el primer párrafo
parrafos.forEach((p) => (p.style.color = "blue"));

//Equivalente a:
// for (let i = 0; i < parrafos.length; i++) {
//   parrafos[i].style.color = "blue";
// }

// 🧪 Ejercicio 2: Contar cuántas imágenes hay en la página (<img>) html
const imagenes = document.querySelectorAll("img");
console.log("Número de imágenes (con querySelectorAll):", imagenes.length);

// 🧪 Ejercicio 3: Cambiar el texto de todos los botones (<button>)

const botones = document.querySelectorAll("button");
botones.forEach((boton) => (boton.innerText = "¡Clic aquí!"));

// Ejercicio 4: Cambiar el color de fondo de todos los elementos con la clase "meloinvento"
const parrafosConMeLoInvento = document.querySelectorAll(".meloinvento");
// parrafosConMeLoInvento.forEach((p) => (p.style.backgroundColor = "lightgreen"));
for (let i = 0; i < parrafosConMeLoInvento.length; i++) {
  parrafosConMeLoInvento[i].style.color = "black";
  parrafosConMeLoInvento[i].style.backgroundColor = "lightgreen";
}
