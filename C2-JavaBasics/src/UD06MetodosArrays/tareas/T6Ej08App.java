package UD06MetodosArrays.tareas;

import javax.swing.JOptionPane;

public class T6Ej08App {

	public static void main(String[] args) {
//		Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por
//		consola el indice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y
//		otro para mostrar.

		int[] numeros = new int[3]; //Ejemplo con 3 pero son 10
		rellenarValores(numeros);
		mostrarValores(numeros);
	}

	private static void mostrarValores(int[] numeros) {
		// Recorrer y mostrar todos los valores
		
		for (int i = 0; i < numeros.length; i++) {
//            System.out.println("Índice: " + i + " - Valor: " + numeros[i]);
            JOptionPane.showMessageDialog(null, "Índice: " + i 
            								+ " - Valor: " + numeros[i]);
		}

	}

	private static void rellenarValores(int[] numeros) {
		// Rellenar valores por pantalla JOPtionPane
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("" 
					+ "Introduce un número"));
		}

	}

}
