let texto = "JavaScript es increíble", longitud= texto.length; //Primer ejercicio
let tej2= " Bienvenido a la programación "; //Segundo ejercicio

//Primer ejercicio
console.log(longitud);
console.log("Slice:", texto.slice(14)); // "increíble"
console.log("Substr:", texto.substr(0, 10)); // "JavaScript"

//Segundo ejercicio
console.log("Trimar trim() quita los espacios al string: " + tej2.trim());
let sinespacios= tej2.trim();
console.log("Texto sin espacios con trim(): " + sinespacios);
// console.log(tej2.toUpperCase());
let mayus = sinespacios.toUpperCase();
console.log("Texto en mayúsculas: " + mayus);
let mayusReplace = mayus.replace("PROGRAMACIÓN", "JavaScript");
console.log(mayusReplace);
let minus = sinespacios.toLowerCase();
let javascript = minus.replace("programación", "JavaScript");
let completo = mayusReplace.concat(" en 2025!");
// console.log(tej2.trim().concat(" en 2024!"));
// let completo = javascript.concat(" en 2024!");
console.log(completo);

//Tercer ejercicio
let variableStringSinValor = ""; // Variable sin valor inicializada
let variableStringEspacioVacio = " ";

let str3 = "Aprender JavaScript es divertido";
console.log("CharAt:", str3.charAt(9)); // "J"
console.log("CharCodeAt:", str3.charCodeAt(9)); // 74
let splitStr3 = str3.split(" ");
console.log("Split:", splitStr3); // ["Aprender", "JavaScript", "es", "divertido"]
let paddedEndStr3 = str3.padEnd(40, "!");
console.log("PadEnd:", paddedEndStr3); // "Aprender JavaScript es divertido!!!!!!!!"
