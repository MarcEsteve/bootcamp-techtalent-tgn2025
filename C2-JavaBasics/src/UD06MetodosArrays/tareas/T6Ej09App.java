package UD06MetodosArrays.tareas;

public class T6Ej09App {

	public static void main(String[] args) {
//		Crea un array de números donde le indicamos por teclado el tamaño del array,
//		rellenaremos el array con números aleatorios entre 0 y 9. Al final muestra por pantalla el
//		valor de cada posición y la suma de todos los valores.
//		Tareas a realizar: Haz un método para rellenar el array(que tenga como parámetros los
//		números entre los que tenga que generar) y otro para mostrar el contenido y la suma del
//		array.
		
		int[] numeros = new int[rellenarArray()];

	}

	private static int rellenarArray() {
		// Indicar tamaño del array
		int size = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Introduce el tamaño del array"));
		return size;
	}

}
