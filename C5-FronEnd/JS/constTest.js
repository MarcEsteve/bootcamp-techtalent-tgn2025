const v = 6; // Constante
console.log("Inicial " + v);
function constTest() {
    const v=5; 
    if (true) {
        const v = 70; // Nueva constante v dentro del bloque if
        console.log("Dentro IF " + v);

    }
    console.log("Dentro función " + v);
}

// v=8; // Error: Assignment to constant variable
constTest();
console.log("Final " + v);
