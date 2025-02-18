package UD05FlujoDatos;
import java.util.Scanner;

public class UD05ScannerApp {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in); // Abro recurso INPUT
		
		System.out.println("-- Bienvenido a JAVA --");
//		System.out.println("Introduce tu nombre:");
//		Pidiendo al usuario un valor de texto referente a su nombre
//		String nombre = escaner.nextLine();
//		escaner.close();
		
//		System.out.println("Hola " + nombre.toUpperCase());
//		
//		//Otro ejemplo con enteros
		System.out.println("Introduce tu edad:");
		
		int edad = escaner.nextInt();
		escaner.close();
		
		System.out.println("Tu edad es " + edad);

	}
	

}