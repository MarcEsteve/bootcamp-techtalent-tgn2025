let str1 = "JavaScript es increíble";
console.log("Longitud:", str1.length); // 23
console.log("Slice:", str1.slice(14)); // "increíble"
console.log("Substr:", str1.substr(0, 10)); // "JavaScript"
document.getElementById("resultado1").innerHTML = "String: JavaScript es increíble <br> Longitud " + str1.length + "<br>Slice: " + str1.slice(14) + "<br>Substr: " + str1.substr(0, 10);