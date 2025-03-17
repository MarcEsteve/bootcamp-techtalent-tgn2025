package UD06MetodosArrays.tareas;

import javax.swing.JOptionPane;

public class T6Ej09App {

	public static void main(String[] args) {
//		Crea un array de números donde le indicamos por teclado el tamaño del array,
//		rellenaremos el array con números aleatorios entre 0 y 9. Al final muestra por pantalla el
//		valor de cada posición y la suma de todos los valores.

		int[] numeros = new int[sizeArray()];
		randomValores(numeros);
		System.out.println("La suma de los valores es: " + mostrarValores(numeros));
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

	private static int sizeArray() {
		// Indicar tamaño del array
		int size = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array"));
		return size;
	}

	private static void randomValores(int[] numeros) {
		// Dar valores aleatorios al array del 0 al 9
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 10);
		}

	}

}
