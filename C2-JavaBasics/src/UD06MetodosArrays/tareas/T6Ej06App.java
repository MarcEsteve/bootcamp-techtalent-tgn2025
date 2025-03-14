package UD06MetodosArrays.tareas;

import java.util.Scanner;

public class T6Ej06App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;

		// Propuesta de while "filtro" para entero positivo
		do {
			System.out.print("Ingresa un número entero positivo: ");
			numero = scanner.nextInt();
		} while (numero < 0);
		;
//		System.out.print("Has ingresado un número entero positivo: " + numero + ", gracias");

		int cantidadCifras = contarCifras(numero);
		System.out.println("El número de cifras de " + numero + " es: " + cantidadCifras);

		// Condicional simple
//		if (numero < 0) {
//			System.out.println("El número ingresado no es positivo.");
//		} else {
//			int cantidadCifras = contarCifras(numero);
//			System.out.println("El número de cifras de " + numero + " es: " + cantidadCifras);
//		}
		scanner.close();
	}

	public static int contarCifras(int numero) {
		if (numero == 0) {
			return 1; // Si el número es 0, tiene una sola cifra
		}
		int count = 0;
		while (numero != 0) {
			numero = numero / 10;
			count++;
		}
		return count;
	}

//	Ejemplo de contar Strings de David
	public static int contador(String numero) {
		int numContador = numero.length();
		return numContador;

	}

//	Ejemplo similar de Daniel
	public static int contarCifrasDaniel(int numero) {
		return String.valueOf(numero).length();
	}
}
