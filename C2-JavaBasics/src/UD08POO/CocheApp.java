package UD08POO;

public class CocheApp {

	public static void main(String[] args) {
//      Instanciación de la clase Coche
		Coche miCoche = new Coche(2020, "Corolla", "Toyota", "rojo");
		System.out.println("¿Cuál es la marca del miCoche? " + miCoche.marca + " " 
				+ miCoche.any + " " + miCoche.modelo + " " + miCoche.color);
		Coche ferrari = new Coche();
		System.out.println("¿Cuál es la marca del Ferrari? " + ferrari.marca 
				+ ferrari.any + ferrari.modelo);
		Coche cocheOpel = new Coche("Opel");
		System.out.println("¿Cuál es la marca del coche3? " + cocheOpel.marca 
				+ cocheOpel.modelo + " " + cocheOpel.any);
		Coche cocheTesla = new Coche("Tesla", 2024);
		System.out.println("¿Cuál es la marca del coche4? " + cocheTesla.marca + " " 
				+ cocheTesla.any + " " + cocheTesla.modelo);

//		Coche coche5 = new Coche("verde","M3",2015);

		miCoche.arrancar();
		miCoche.acelerar();
		miCoche.frenar();
		miCoche.detener();

	}

}
