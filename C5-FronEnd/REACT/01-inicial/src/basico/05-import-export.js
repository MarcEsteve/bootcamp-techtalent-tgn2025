//Importaciones en JavaScript son una forma de incluir código de otros archivos o módulos en tu archivo actual. Esto es especialmente útil para organizar el código y reutilizar funciones, objetos o variables.

// import {¿qué recurso importo?} from '¿dónde lo importo?';

// import { heroes } from '../data/heroes';
// console.log( heroes );

// import heroes, { owners } from '../data/heroes';
// console.log( owners );

import heroes from "../data/heroes"; 

// https://developer.mozilla.org/es/docs/Web/JavaScript/Reference/Global_Objects/Array/find

// const getHeroeById = (id) =>{
//   return heroes.find((heroe) => {
//     if (heroe.id === id) {
//       return true;
      
//     } else {
//       return false;
//     }
//   });
// }

// console.log( getHeroeById(2) );

export const getHeroeById = (id) => heroes.find((heroe) => heroe.id === id);

console.log( getHeroeById(2) );

//filter()
const frutas = ["plátano", "kiwi"];
const result = frutas.filter((textoFruta) => textoFruta.length > 6);
console.log(result);
// Expected output: Array ["exuberant", "destruction", "present"]

// find? solo devuelve 1, filter todos
// https://developer.mozilla.org/es/docs/Web/JavaScript/Reference/Global_Objects/Array/filter
const getHeroesByOwner = (propietario) =>
  heroes.filter((heroe) => heroe.owner === propietario);

console.log( getHeroesByOwner('Marvel') );
