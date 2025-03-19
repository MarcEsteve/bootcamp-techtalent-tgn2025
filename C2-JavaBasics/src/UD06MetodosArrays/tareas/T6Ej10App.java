package UD06MetodosArrays.tareas;

import java.util.Scanner;

public class T6Ej10App {

	public static void main(String[] args) {
//		Crea un array de números de un tamaño pasado por teclado, el array contendrá
//		números aleatorios primos entre los números deseados, por último nos indicar 
//		cual es el mayor de todos.
//		Haz un método para comprobar que el número aleatorio es primo, puedes 
//		hacer todos lo métodos que necesites.

		// 1. Preguntar tamaño del array
		int[] numerosPrimos = new int[sizeArray()]; // new int[3];
//		System.out.println(numerosPrimos.length); //Devuelve el tamaño escogido

		// 2. Pedimos 2 valores (max,min) entre los que este de rango el random por
		// consola de scanner

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor mínimo:");
		int min = sc.nextInt();
		System.out.println("Introduce el valor máximo:");
		int max = sc.nextInt();

		// 3. Rellenar array con valores random entre min y max
		randomValoresPrimos(numerosPrimos, min, max);

		for (int i = 0; i < numerosPrimos.length; i++) {
			if (i==0) {
				System.out.print("Los números primos son: {[" + i + "] = " 
						+ numerosPrimos[i] + ", ");
			} else if (i == numerosPrimos.length - 1) {
				System.out.print("[" + i + "] = "+numerosPrimos[i] + "}");
			} else if (i == numerosPrimos.length - 2) {
				System.out.print("[" + i + "] = " + numerosPrimos[i] + ", ");
			} else {
				System.out.print("[" + i + "] = " + numerosPrimos[i]);
			}
		}

		// 4. Mostrar valores y mayor
		System.out.println("\nEl número mayor es: " + buscarMayor(numerosPrimos));
		sc.close();

	}

	private static void randomValoresPrimos(int[] numerosPrimos, int min, int max) {
		// Rellenar array con valores primos random entre min y max
		for (int i = 0; i < numerosPrimos.length; i++) {
			numerosPrimos[i] = numeroPrimo(min, max);
		}

	}

	private static int numeroPrimo(int min, int max) {
		// Devuelve un número primo entre min y max
		int numero = 0;
		boolean esPrimo = false;
		while (!esPrimo) {
			numero = (int) (Math.random() * (max - min + 1) + min);
			esPrimo = esPrimo(numero);
		}
//		System.out.println("El número primo es: " + numero);
		return numero;
	}

	public static boolean esPrimo(int valorPrimo) {
		boolean primoSiNo = true;

		if (valorPrimo <= 1) {
			primoSiNo = false;
			return primoSiNo;
		}

//		for(int i=valorPrimo-1; i>1; i--) {
//			if(valorPrimo%i == 0) {
//				primoSiNo = false;
//			}
//		}

		for (int i = 2; i <= Math.sqrt(valorPrimo); i++) {
			if (valorPrimo % i == 0) {
				primoSiNo = false;
				return primoSiNo;
				// Equivalente:
				// primoSiNo = false;
				// break;
			}
		}

		return primoSiNo;
	}

	private static int sizeArray() {
		// Pide por consola el tamaño del array
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array:");
		int size = sc.nextInt();
		return size;
	}

	private static int buscarMayor(int[] numerosPrimos) {
		int mayor = 0;
		for (int i = 0; i < numerosPrimos.length; i++) {
			if (numerosPrimos[i] > mayor) {
				mayor = numerosPrimos[i];
			}
		}

		return mayor;
	}

}
