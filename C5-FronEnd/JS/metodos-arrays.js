let array = [1, 2, 3, 4, 5];

// toString()
console.log("toString:", array.toString()); // "1,2,3,4,5"

// join()
console.log("join:", array.join(" - ")); // "1 - 2 - 3 - 4 - 5"

// pop()
// Valores iniciales [1, 2, 3, 4, 5]
let popped = array.pop(); // Dos acciones: elimina el último elemento y lo devuelve
console.log("pop:", popped); // 5
console.log("array after pop:", array); // [1, 2, 3, 4]

// push()
//Valor actual del array: [1, 2, 3, 4]
array.push("pepito"); // Parámetro añadimos valor "pepito" al final del array
console.log("push:", array); // [1, 2, 3, 4, "pepito"]

// shift()
//Valor actual del array: [1, 2, 3, 4, "pepito"]
// Elimina el primer elemento del array y lo devuelve y los valores restantes se desplazan hacia la izquierda
let shifted = array.shift();
console.log("shift:", shifted); // 1
console.log("array after shift:", array); // [2, 3, 4, "pepito"]

// unshift()
// Valor actual [2, 3, 4, "pepito"]
// Añade uno o más elementos al inicio del array y devuelve la nueva longitud del array
array.unshift(0, 6); // Añadimos 0 y 6 al inicio
array.unshift("inicio");
console.log("unshift:", array); // ["inicio",0,6,2,3,4,"pepito"]

// concat()
let array2 = [1, 2, 3, 4];
let newArray = array2.concat([6, 7, 8]);
console.log("concat:", newArray); // [1, 2, 3, 4, 6, 7, 8]

// copyWithin()
newArray.copyWithin(2, 0, 2);
console.log("copyWithin:", newArray); // [0, 2, 0, 2, 6, 7, 8, 9]

// every()
let allAboveZero = newArray.every((num) => num >= 0);
console.log("every:", allAboveZero); // true

// filter()
let filtered = newArray.filter((num) => num > 2);
console.log("filter:", filtered); // [6, 7, 8, 9]

// flat()
let nestedArray = [1, [2, [3, [4]], 5]];
let flattened = nestedArray.flat(2);
console.log("flat:", flattened); // [1, 2, 3, [4], 5]

// flatMap()
let flatMapped = array.flatMap((num) => [num * 2]);
console.log("flatMap:", flatMapped); // [0, 4, 6, 8, 12]

// forEach()
array.forEach((num) => console.log("forEach:", num * 2));

// indexOf()
console.log("indexOf 3:", array.indexOf(3)); // 2

// lastIndexOf()
console.log("lastIndexOf 3:", array.lastIndexOf(3)); // 2

// map()
let mapped = array.map((num) => num * 2);
console.log("map:", mapped); // [0, 4, 6, 8, 12]

// reduce()
let sum = array.reduce((acc, num) => acc + num, 0);
console.log("reduce (sum):", sum); // 15

// reduceRight()
let sumRight = array.reduceRight((acc, num) => acc + num, 0);
console.log("reduceRight (sum):", sumRight); // 15

// reverse()
let reversed = array.slice().reverse();
console.log("reverse:", reversed); // [6, 4, 3, 2, 0]

// slice()
let sliced = array.slice(1, 4);
console.log("slice:", sliced); // [2, 3, 4]

// some()
let someAboveFour = array.some((num) => num > 4);
console.log("some:", someAboveFour); // true

// sort()
let sorted = array.slice().sort((a, b) => b - a);
console.log("sort:", sorted); // [6, 4, 3, 2, 0]

// splice()
let spliced = array.splice(2, 2, 99, 100);
console.log("splice:", spliced); // [3, 4]
console.log("array after splice:", array); // [0, 2, 99, 100, 6]

setTimeout(() => {
  console.log("Esta instrucción se ejecuta después de 5 segundos");
}, 5000);

setInterval(() => {
  console.log("Esta instrucción se ejecuta cada 2 segundos");
}, 2000);