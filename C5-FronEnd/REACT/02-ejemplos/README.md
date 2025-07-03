# 🕸️ React + JavaScript Basics para el Bootcamp Techtalent Tarragona 2025

Este repositorio contiene una serie de ejemplos introductorios para practicar conceptos esenciales de JavaScript utilizados en React.

---

## 📦 Requisitos

- Node.js
- Vite (instalable con `npm create vite@latest`)
- Navegador moderno
- Editor de código como VS Code

---

## 🚀 Contenidos del proyecto

### ✅ Consola y Template Strings
```js
const nombre   = 'Marc';
const apellido = 'Esteve';
const nombreCompleto = `${ nombre } ${ apellido }`;
console.log( nombreCompleto );
```

### ✅ Funciones y funciones de flecha
```js
function sumar(a,b) { return a + b; }
const saludar = (nombre) => `Hola, ${nombre}`;
```

### ✅ Desestructuración de objetos
```js
const persona = { nam: 'Peter', edad: 18, clave: 'Spiderman' };
const { nam, edad, clave } = persona;
```

### ✅ Uso de desestructuración en funciones
```js
const usarContexto = ({ clave, edad }) => ({
  nombreClave: clave,
  anys: edad,
  latlng: { lat: 40.7128, lng: -74.0060 }
});
```

### ✅ Desestructuración de Arrays
```js
const personajes = ['Peter Parker', 'Miles Morales', 'Gwen Stacy'];
const [ , , personaje3 ] = personajes;
```

### ✅ Simulación de useState
```js
const useSpiderState = (valor) => [valor, () => console.log(`Lanzando telaraña desde ${valor}`)];
const [nombre, lanzarTelaraña] = useSpiderState('Peter Parker');
```

## 🧪 Cómo probar
1. Clona el proyecto:
```bash
git clone https://github.com/MarcEsteve/bootcamp-techtalent-tgn2025
cd bootcamp-techtalent-tgn2025
```

2. Instala dependencias y ejecuta:
```bash
npm install
npm run dev
```
