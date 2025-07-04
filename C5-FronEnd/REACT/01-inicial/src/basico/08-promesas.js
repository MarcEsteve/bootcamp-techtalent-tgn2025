// Concepto de promesas en JavaScript
// Las promesas son objetos que representan la finalización (o el fracaso) de una operación asíncrona y su valor resultante.
// https://developer.mozilla.org/es/docs/Web/JavaScript/Reference/Global_Objects/Promise

import { getHeroeById } from "./05-import-export";

// const promesa = new Promise();

const promesa = new Promise((resolve, reject) => {

  setTimeout(() => {
    resolve();
  },1000)

});

promesa.then( () => {
  console.log("Se ejecutó la promesa");
});

// Ejemplo de una promesa que se resuelve o se rechaza después de 2 segundos
const exito = false; // ✅ Pon esto en true o false para probar resolve o reject

const promiseA = new Promise((resolutionFunc, rejectionFunc) => {
  setTimeout(() => {
    if (exito) {
      resolutionFunc(777); // Resuelve la promesa con un valor
    } else {
      rejectionFunc("Algo salió mal"); // Rechaza la promesa con un error
    }
  }, 2000); // Espera 2 segundos
});

promiseA
  .then((val) => {
    console.log("✅ La promesa se resolvió con:", val);
  })
  .catch((err) => {
    console.error("❌ La promesa fue rechazada con error:", err);
  });

console.log("⏳ Operación en curso...");


// Las promesas por naturaleza son asíncronas, por lo que se ejecutan en segundo plano y no bloquean el hilo principal de ejecución.

// const promesa = new Promise( (resolve, reject) => {

//     setTimeout( () =>  {
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
