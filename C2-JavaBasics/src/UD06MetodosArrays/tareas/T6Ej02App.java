package UD06MetodosArrays.tareas;

import java.util.Random;

import javax.swing.JOptionPane;

public class T6Ej02App {

	public static void main(String[] args) {

		int cantRadoms = Integer.parseInt(JOptionPane.showInputDialog("Introduce "
														+ "la cantidad de randoms: "));
		int rangoMax, rangoMin;


		while (cantRadoms > 0) {

			// Acciones de rangos y randoms
			rangoMin = Integer.parseInt(JOptionPane.showInputDialog(""
								+ "Introduce el rango mínimo: "));
			rangoMax = Integer.parseInt(JOptionPane.showInputDialog(""
								+ "Introduce el máximo rango: "));
			System.out.println(enteroRandom(rangoMin, rangoMax));
			cantRadoms--;
		}
	}

	public static int enteroRandom(int min, int max) {

		// Cálculo del random
//		int resultado = (int) (Math.random() * (max - min + 1)) + min;
		Random aleatorio = new Random();
		int resultado= aleatorio.nextInt(min,max);
		return resultado;
	}

}