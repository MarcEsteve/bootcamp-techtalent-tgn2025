package UD06MetodosArrays.tareas;

import java.util.Scanner;

public class T6Ej04factorial {

	public static void main(String[] args) {


		int numero = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println(" -- Número a su factorial --");
		System.out.println("Por favor, introduce el número entero deseado:");

		numero = Integer.parseInt(sc.nextLine());
		sc.close();
		System.out.println("El factorial de " + numero + " generado es: " + calcularFactorial(numero));

//		System.out.println("El factorial de " + numero +" generado es: " + factorial(numero));



	}

	// Cáclulo del factorial de un número entero
	public static int calcularFactorial(int n) {

		for (int i = n; i >= 2; i--) {
			n *= i - 1;
		}

		// Incrementando
//		for (int i = 1; i <= n; i++) {
//			n *= i;
//		}

		return n;
	}

	// Factorial de Manel
	public static int factorial(int n) {
		n = Math.abs(n);

		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}


}
