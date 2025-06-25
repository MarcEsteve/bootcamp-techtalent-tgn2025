// Ejercicio 1: Crear un array de números y realizar operaciones básicas
let fruits = ["manzana", "banana", "pera", "naranja", "uva"];
console.log(fruits); // ["manzana", "banana", "pera", "naranja", "uva"]
let frutaEliminada = fruits.pop();
console.log(fruits); // ["manzana", "banana", "pera", "naranja"]
console.log(frutaEliminada); // "uva"
fruits.unshift("kiwi");
console.log(fruits); // ["kiwi", "manzana", "banana", "pera", "naranja"]
let combined = fruits.concat(["fresa", "mango"]);
console.log(combined); // ["kiwi", "manzana", "banana", "pera", "naranja", "fresa", "mango"]

// Ejercicio 2: Crear un array de números y realizar operaciones básicas
let numbers = [5, 12, 8, 130, 44];
console.log(numbers); // [5, 12, 8, 130, 44]
let filteredNumbers = numbers.filter((num) => num > 10);
console.log("Filtrados mayores de 10");
console.log(filteredNumbers); // [12, 130, 44]
let squaredNumbers = numbers.map((num) => num * num);
console.log(squaredNumbers); // [25, 144, 64, 16900, 1936]

// Ejercicio 3: Crear un array de objetos y realizar use de reduce(), sort() y reverse()
console.log("Ejercicio 3");
let array3 = [1, 7, 3, 4, 5];
console.log(array3);
let sum3 = array3.reduce((acc, num) => acc + num, 0);
console.log(sum3); // 20
let sorted3 = array3.slice().sort((a, b) => b - a);
console.log(sorted3); // [7, 5, 4, 3, 1]
let reversed3 = array3.slice().reverse();
console.log(reversed3); // [5, 4, 3, 7, 1]
