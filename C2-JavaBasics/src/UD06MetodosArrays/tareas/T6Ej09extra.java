package UD06MetodosArrays.tareas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class T6Ej09extra {

	public static void main(String[] args) {
//		EXTRA:
//		Tareas a realizar: Haz un método para rellenar el array(que tenga como parámetros los
//		números entre los que tenga que generar) y otro para mostrar el contenido y la suma del
//		array.
		
		// 1. Preguntar tamaño del array
		int[] numeros = new int[sizeArray()];

		// 2. Pedimos 2 valores (max,min) entre los que este de rango el random por consola de scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor mínimo:");
		int min = sc.nextInt();
		System.out.println("Introduce el valor máximo:");
		int max = sc.nextInt();

		// 3. Rellenar array con valores random entre min y max
		randomValores(numeros, min, max);

		// 4. Mostrar valores y suma
		System.out.println("La suma de los valores es: " + mostrarValores(numeros));

	}

	private static int mostrarValores(int[] numeros) {
		// Recorre valores y muestra los randoms y la suma
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
			System.out.println("Índice: " + i + " - Valor: " + numeros[i]);
		}
		return suma;
	}

	private static int[] randomValores(int[] numeros, int min, int max) {
		for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * (max - min + 1) + min);
		}
		
		return numeros;
	}

	private static int sizeArray() {
		// Pide por consola el tamaño del array
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño del array:");
		int size = sc.nextInt();
		return size;
	}

}
