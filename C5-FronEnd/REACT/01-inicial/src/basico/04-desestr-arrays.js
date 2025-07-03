//Desstructuración de arrays en JavaScript

// Lista de personajes de Spiderman
const personajes = ['Peter Parker', 'Miles Morales', 'Gwen Stacy'];

//Normal:

console.log(personajes[0]); // Peter Parker
console.log(personajes[1]); // Miles Morales
console.log(personajes[2]); // Gwen Stacy

// Queremos el tercer personaje
const [personaje1 ] = personajes;
const [ , personaje2 ] = personajes;
const [ , , personaje3 ] = personajes;
console.log(personaje3); // Gwen Stacy

// Una función que retorna un array con información
const retornaSpideyInfo = () => {
    return ['Spidey', 2002];
}

// Desestructuración del array retornado
const [ alias, añoAparicion ] = retornaSpideyInfo();
console.log(alias, anyAparicion); // Spidey 2002


// Simulación de un hook* tipo useState (como en React)
const useSpiderState = (valor) => {
    return [ valor, () => { console.log(`Lanzando telaraña desde ${valor}`) } ];
}

//Un hook* en React es una función que permite usar el "estado" y otras características de React sin escribir una clase.
// *Nota: Aunque aquí no estamos en un entorno de React, usamos el término "hook" para ilustrar el concepto de estado y funciones asociadas.
// "Estado" en React se refiere a la capacidad de un componente para mantener y gestionar datos que pueden cambiar con el tiempo, permitiendo que la interfaz de usuario se actualice automáticamente cuando esos datos cambian.

const arr = useSpiderState('Peter Parker');
console.log(arr);
arr[0]; // Peter Parker
arr[1](); // Lanzando telaraña desde Peter Parker

// Desestructuración del array retornado
// const [ spiderNombre, lanzarTelaraña ] = useSpiderState('Peter Parker');

// console.log(spiderNombre);       // Peter Parker
// lanzarTelaraña();                // Lanzando telaraña desde Peter Parker
