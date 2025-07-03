console.log("Hola mundo");
// Si editas, guardas y recargas, verás el cambio en la consola 
// Gracias al Live Reload Server de Vite se hace automáticamente

// Template Strings

const nombre   = 'Marc';
const apellido = 'Esteve';

// const nombreCompleto = nombre + ' ' + apellido;
const nombreCompleto = `${ nombre } ${ apellido }`;

console.log( nombreCompleto );

function getSaludo(nombre) {
    return 'Hola ' + nombre;
}

console.log( `Este es un texto: ${ getSaludo( nombre ) }` );

// Funciones en JS

//Función normal
function sumar(a,b) {return a + b;}

// let sumar=30;

console.log(sumar(3,5));

// Función de flecha
const saludar1 = ( nombre ) => { return `Hola, ${ nombre }`;}

console.log( saludar1('Marc') );

// Función de flecha simplificada
const saludar2 = ( nombre, apellido ) => `Hola, ${nombre} ${apellido }`;
console.log( saludar2("Pedro","Jiménez") );

// Función de flecha sin parámetros con retorno implícito
const saludar3 = () => `Hola Mundo`;
console.log( saludar3("Andreu") );

// Función que retorna un objeto
const getUser = () => ({
        uid: '01234',
        username: 'marceg'
});

// console.log(getUser());

const user = getUser();
console.log(user);

// Tarea: transformar esta función a una función de flecha
// y que retorne un objeto implícitamente:
// function getUsuarioActivo( nombre ) {
//     return {
//         uid: '12345',
//         username: nombre
//     }
// }

const getUsuarioActivo = (nombre) => ({
        uid: '12345',
        username: nombre
    });


const usuarioActivo = getUsuarioActivo('Marc');
console.log( usuarioActivo );

// Desestructuración de objetos en JavaScript
// Asignación desestructurante

const persona = {
    nam: 'Peter',
    edad: 18,
    clave: 'Spiderman'
};

// console.log(persona.nam); // 'Peter'
// console.log(persona.edad);   // 18          
// console.log(persona.clave);  // 'Spiderman'

// Desestructuración del objeto persona
const { nam, edad, clave } = persona;

console.log(nam); // 'Peter'
console.log(edad);   // 18
console.log(clave);  // 'Spiderman'

// Desestructuración en el argumento de una función
// Aquí usamos un objeto como parámetro de la función
const usarContexto = ({ clave, nombre, edad, rango = 'Vecino amigable' }) => {

    // Aquí podrías hacer cualquier lógica adicional
    return {
        nombreClave: clave,
        anys: edad,
        latlng: {
            lat: 40.7128,   // Coordenadas de Nueva York 🗽
            lng: -74.0060
        }
    }
};

// Desestructuración al llamar la función
const { nombreClave, anys, latlng: { lat, lng } } = usarContexto(persona);

console.log(nombreClave, anys);  // 'Spiderman', 18
console.log(lat, lng);            // 40.7128, -74.0060

//Desstructuración de arrays en JavaScript

// Lista de personajes de Spiderman
const personajes = ['Peter Parker', 'Miles Morales', 'Gwen Stacy'];

//Normal:

// console.log(personajes[0]); // Peter Parker
// console.log(personajes[1]); // Miles Morales
// console.log(personajes[2]); // Gwen Stacy

// Desestructuración de arrays
const [personaje1] = personajes;
const [ , personaje2 ] = personajes;
const [ , , personaje3 ] = personajes;
//Equivalente a const [personaje1 , personaje2, personaje3 ] = personajes;
console.log(personaje1); // Peter Parker
console.log(personaje2); // Miles Morales
console.log(personaje3); // Gwen Stacy

// Una función que retorna un array con información
const retornaSpideyInfo = () => {
    return ['Spidey', 2002];
}

// Desestructuración del array retornado
const [ alias, anyAparicion ] = retornaSpideyInfo();
console.log(alias, anyAparicion); // Spidey 2002

// Simulación de un hook* tipo useState (como en React)
const useSpiderState = (valor) => {
    return [ valor, () => { console.log(`Lanzando telaraña desde ${valor}`) } ];
}

// const arr = useSpiderState('Peter Parker');
// console.log(arr);
// arr[0]; // Peter Parker
// arr[1](); // Lanzando telaraña desde Peter Parker

// Desestructuración del array retornado
const [ spiderNombre, lanzarTelaraña ] = useSpiderState('Peter Parker');

console.log(spiderNombre);       // Peter Parker
lanzarTelaraña();                // Lanzando telaraña desde Peter Parker
