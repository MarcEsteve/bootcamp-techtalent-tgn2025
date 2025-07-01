var x = 31;

console.log(`Antes del bloque ${x}`); // Output: 31

if (true) {
  var x = 71; // Es otra variable 'x' dentro del bloque if, pero con 'var' se redefine la variable global
  console.log(`Dentro del bloque if ${x}`); // Output: 71
}
console.log(`Justo fuera del bloque if ${x}`); // Output: 71
var x = 91; // Redefinición de la variable 'x' global
console.log(`Después de redefinir la x ${x}`); // Output: 91
