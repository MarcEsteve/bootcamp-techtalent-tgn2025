package UD06MetodosArrays;

public class UD06ArrayMultApp {
	public static void main(String[] args) {

		// Declaramos un array de 3 filas x 5 columnas
		int array[][] = new int[3][5];
		// Asignamos en la primera fila (indice 0), segunda columna (indice 1)
		array[0][1] = 5;
		// Asignamos en la segunda fila (indice 1), cuarta columna (indice 3)
		array[1][3] = 6;
		// Asignación de todos los valores
		int matriz[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		System.out.println("Fila 3ª (índice 2) de la Columna 5ª (índice 4): " + matriz[2][4]);

//		Ejemplo de foreach "unidimensional"
		String frutas[] = { "platano", "mandarina", "palta", "pera", "arandano", "limon" };

		for (String fruta : frutas) {
			System.out.print(fruta + " \n");
		}

		// Recorrer arrays multidimensionales
		System.out.println("Primer Foreach");
		// Recorrer la matriz utilizando un bucle foreach
		for (int[] fila : matriz) {
			for (int elemento : fila) {
				System.out.print(elemento + " \n");
			}
//			System.out.println(); // Salto de línea después de cada fila
		}
		System.out.println("For habitual de recorrer arrays");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println(matriz[i][j]);
			}
		}

	}
}
