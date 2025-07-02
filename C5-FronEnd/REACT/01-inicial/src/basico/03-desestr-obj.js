// Desestructuración de objetos en JavaScript
// Asignación desestructurante
// https://developer.mozilla.org/es/docs/Web/JavaScript/Reference/Operators/Destructuring

const persona = {
    nombre: 'Peter',
    edad: 18,
    clave: 'Spiderman'
};

// console.log(persona.nombre); // 'Peter'
// console.log(persona.edad);   // 18          
// console.log(persona.clave);  // 'Spiderman'

// Desestructuración del objeto persona
const { nombre, edad, clave } = persona;

console.log(nombre); // 'Peter'
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
