document.getElementById("nombre").addEventListener("input", function () {
  document.getElementById("saludo").textContent = `Hola, ${this.value}`;
});
