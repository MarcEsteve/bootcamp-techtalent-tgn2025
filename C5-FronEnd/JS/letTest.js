//DECLARAR CON let

let x = 31;

console.log(`Antes del bloque ${x}`); // Output: 31

if (true) {
  //   x = 71;
  let x = 71;
  console.log(`Dentro del bloque if ${x}`);
}
console.log(`Justo fuera del bloque if ${x}`);
// let x = 91; //No puedo redefinir la variable 'x'
x = 91;
