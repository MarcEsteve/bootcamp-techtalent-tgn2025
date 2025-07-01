//✅ Ejercicio 1: Mostrar el valor del campo seleccionado (radio buttons)
function mostrarGenero() {
  const generos = document.getElementsByName("genero");
  for (let i = 0; i < generos.length; i++) {
    if (generos[i].checked) {
      document.getElementById(
        "resultado1"
      ).textContent = `Has seleccionado: ${generos[i].value}`;
    }
  }
}

//✅ Ejercicio 2: Contar cuántas casillas están marcadas (checkboxes)
function contarLenguajes() {
  const checks = document.getElementsByName("lenguajes");
  let contador = 0;
  checks.forEach((check) => {
    if (check.checked) contador++;
  });
  document.getElementById(
    "resultado2"
  ).textContent = `Seleccionaste ${contador} lenguaje(s)`;
}

// ✅ Ejercicio 3: Sumar valores numéricos de campos con el mismo nombre

function sumarNotas() {
  const notas = document.getElementsByName("nota");
  let suma = 0;
  for (let i = 0; i < notas.length; i++) {
    suma += Number(notas[i].value);
  }
  document.getElementById("resultado3").textContent = `Suma total: ${suma}`;
}
