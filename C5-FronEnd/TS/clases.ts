// Clases en TypeScript

class Jugador {
    // Propiedades: atributo
    public nombre: string; // public no es obligatorio porque es el modificador por defecto
    apellidos: string; // es public también
    private goles: number;

    // Contructores
    //Un único contructor en TypeScript

    // constructor() {
    //     this.nombre = "sin nombre";
    //     this.apellidos = "sin apellidos";
    //     this.goles = 0;
    // }

    constructor(nombre: string, surname: string) {
        this.nombre = nombre;
        this.apellidos = surname;
        this.goles = 0;
    }
    //Propiedades: métodos

    //Setters y getters
    setGoles(goles: number): void {
        this.goles = goles;
    }

    getGoles(): number {
        return this.goles;
    }
}

//Instanciación del objeto Jugador() para la variable "messi"
let messi = new Jugador('Lionel','Messi');

// console.log(messi.nombre); //Lionel
// console.log(messi.goles); // Error ya que es "private"
// console.log(messi.getGoles());

// Clases con constructor breve (si declaramos los parámetros del constructor con
// modificador de acceso se crean las propiedades con el mismo nombre)

class Player {

    constructor(public name: string, 
                public surname: string, 
                private goals: number) {}
                //this.name= name;

    // setter y getters...
    // getGoals(): number {
    //     return this.goals;
    // }
}

let jugador2 = new Player('Lionel','Messi', 0);

// Interfaces (como tipado estructural)

interface EstadoBoton {
    hidden: boolean;
    disabled: boolean;
    waiting: boolean;
    backgroundColor?: string // Se pueden declarar como opcionales
}

let estadoBotonEnvio: EstadoBoton = {
    hidden: false,
    disabled: true,
    waiting: false,
    // backgroundColor: 'green' //Al ser opcional si no se incluye no arroja error
}

// Interfaces como implementaciones obligatorias para clases

interface DatosMaestros {
    razonSocial: string;
    cif: string;

    getCif(): string;
    setCif(cif: string): void;
}

class Proveedor implements DatosMaestros {
    razonSocial: string;
    cif: string;

    constructor(razonSocialIn: string, cifIn: string) {
        this.razonSocial = razonSocialIn;
        this.cif = cifIn;
    }

    getCif(): string {
        return this.cif;
    }

    setCif(cif: string): void {
        this.cif = cif;
    }
} 

// Herencia en TypeScript

class Employee {
    name: string;
    protected age: number; // Accesible desde clases que hereden de Employee
    private mobileNumber: string;

    constructor(name: string, age: number) {
        this.name = name;
        this.age = age;
        this.mobileNumber = ''
    }

    // getters y setters...
}

class Manager extends Employee {
    role: string;

    constructor(name: string, age: number, role: string) {
        super(name, age);
        this.role = role;
    }

    // getters y setters de las propiedades de esta clase
}