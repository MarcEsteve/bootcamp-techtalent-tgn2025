// Concepto de promesas en JavaScript
// Las promesas son objetos que representan la finalización (o el fracaso) de una operación asíncrona y su valor resultante.
// https://developer.mozilla.org/es/docs/Web/JavaScript/Reference/Global_Objects/Promise

import { getHeroeById } from "./05-import-export";

// const promesa = new Promise();
// Las promesas por naturaleza son asíncronas, por lo que se ejecutan en segundo plano y no bloquean el hilo principal de ejecución.

// const promesa = new Promise( (resolve, reject) => {

//     setTimeout( () =>  {
//         // Tarea
//         // importen el
//         const p1 = getHeroeById(2);
//         resolve( p1 );
//         // reject( 'No se pudo encontrar el héroe' );
//     }, 2000 )

// });

// promesa.then( (heroe) => {
//     console.log('heroe', heroe)
// })
// .catch( err => console.warn( err ) );

const getHeroeByIdAsync = (id) => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      // Tarea
      // importen el
      const p1 = getHeroeById(id);
      if (p1) {
        resolve(p1);
      } else {
        reject("No se pudo encontrar el héroe");
      }
    }, 2000);
  });
};

getHeroeByIdAsync(1).then(console.log).catch(console.warn);
