// Funciones en JS

//Función normal
function sumar( a, b ) {
    return a + b;
}

// Función de flecha
const saludar1 = ( nombre ) => {
    return `Hola, ${ nombre }`;
}

// Función de flecha simplificada
const saludar2 = ( nombre, apellido ) => `Hola, ${nombre} ${apellido }`;

// Función de flecha sin parámetros con retorno implícito
const saludar3 = () => `Hola Mundo`;

// Función de flecha simplificada con un solo parámetro
// const saludar = nombre => `Hola, ${ nombre }`;

// console.log( saludar('Marc') )

console.log( saludar2("Pedro","Jiménez") );
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

