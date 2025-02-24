package UD04JavaBasics.tareas;

public class T4Ejercicio2App {
	public static void main(String[] args) {
		// Declaración e inicialización de variables
		int N = 5;
		double A = 4.56;
		char C = 'a';
		char D = '&';

		// Muestra el valor de cada variable
		System.out.println("Variable N = " + N);
		System.out.println("Variable A = " + A);
		System.out.println("Variable C = " + C);
		
//		double resultadoSuma = N + A;

		// Muestra la suma de N + A y la diferencia de A - N
		System.out.println(N + " + " + A + " = " + (N + A));
		System.out.println(A + " - " + N + " = " + (A - N));

		// Muestra el valor numérico correspondiente al carácter en la variable C
		System.out.println("Valor numérico del carácter " + C + " = " + (int) C);
//		https://elcodigoascii.com.ar/ Tabla ASCII
		
		System.out.println("Ejemplo de & en ASCII es " + (int) D);
	}
}