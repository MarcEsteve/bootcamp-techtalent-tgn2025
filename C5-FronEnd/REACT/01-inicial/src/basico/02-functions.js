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
const saludar2 = ( nombre, apellido ) => `Hola, ${ nombre, apellido }`;

// Función de flecha sin parámetros con retorno implícito
const saludar3 = () => `Hola Mundo`;

// Función de flecha simplificada con un solo parámetro
// const saludar = nombre => `Hola, ${ nombre }`;

// console.log( saludar('Marc') )

console.log( saludar2("Pedro","Jiménez") );
console.log( saludar3("Andreu") );


const getUser = () => ({
        uid: 'ABC123',
        username: 'El_Papi1502'
});


const user = getUser();
console.log(user);

// Tarea
const getUsuarioActivo = ( nombre ) =>({
    uid: 'ABC567',
    username: nombre
})

const usuarioActivo = getUsuarioActivo('Fernando');
console.log( usuarioActivo );