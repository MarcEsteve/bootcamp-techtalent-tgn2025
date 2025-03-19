package UD06MetodosArrays.tareas;

import java.util.Scanner;

public class T6Ej09App {

	public static void main(String[] args) {
//		Crea un array de números donde le indicamos por teclado el tamaño del array,
//		rellenaremos el array con números aleatorios entre 0 y 9. Al final muestra por pantalla el
//		valor de cada posición y la suma de todos los valores.
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[sizeArray(sc)];
		randomValores(numeros);
		System.out.println("La suma de los valores es: " + mostrarValores(numeros));
		sc.close();
	}

	private static int sizeArray(Scanner sc) {
		// Indicar tamaño del array
//		int size = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array"));
		System.out.println("Introduce el tamaño del array");
		int size = sc.nextInt();
		return size;
	}

	private static void randomValores(int[] numeros) {
		// Dar valores aleatorios al array del 0 al 9
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 10);
		}

	}
	

	private static int mostrarValores(int[] numeros) {
		//Recorre valores y muestra los randoms y la suma
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
			System.out.println("Índice: " + i + " - Valor: " + numeros[i]);
		}	
		return suma;
	}

}
