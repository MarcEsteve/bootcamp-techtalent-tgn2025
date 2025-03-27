package UD10TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraSegura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Introdueix el primer número: ");
			String primerText = scanner.nextLine();
			int num1 = Integer.parseInt(primerText); 
			// Pot llançar NumberFormatException

			System.out.print("Introdueix el segon número: ");
			int num2 = scanner.nextInt(); // Pot llançar InputMismatchException

			int resultat = dividir(num1, num2); // Pot llançar ArithmeticException

			System.out.println("Resultat de la divisió: " + resultat);

		} catch (NumberFormatException e) {
			System.out.println("⚠️ Error: el primer valor no era un número vàlid.");
		} catch (InputMismatchException e) {
			System.out.println("⚠️ Error: introdueix un número enter vàlid.");
		} catch (ArithmeticException e) {
			System.out.println("⚠️ Error: no es pot dividir per zero.");
		} catch (Exception e) { //Seria como un else que captura todo lo demás
			System.out.println("⚠️ Error inesperat: " + e.getMessage());
		}

		// Simulació d'un NullPointerException
		try {
			String nom = null;
			System.out.println("Longitud del nom: " + nom.length());
		} catch (NullPointerException e) {
			System.out.println("⚠️ Error: estàs intentant accedir a un objecte nul.");
		}
	
		System.out.println("Fi del programa.");
		scanner.close();
	}

	public static int dividir(int a, int b) {
		return a / b;
	}
}
