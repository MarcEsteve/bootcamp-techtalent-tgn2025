package UD05FlujoDatos.tareas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class T5Ej0203App {

	public static void main(String[] args) {
		// Declara un String que contenga tu nombre, después muestra
		// un mensaje de bienvenida por consola.
		// Por ejemplo: si introduzco “Fernando”,
		// me aparezca “Bienvenido Fernando”.

		String nombre = "Fernando";
		int edad= 0;

		System.out.println("Bienvenido " + nombre);

		nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");

		// System.out.println("Bienvenido " + nombre);//Ejercicio 2
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);

		// Con Scanner

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		nombre = scanner.nextLine();
		System.out.print("Introduce tu edad: ");
		edad = scanner.nextInt();
		
		
		System.out.println("Bienvenido " + nombre + " tienes " + edad + " años.");

//		nombre = scanner.nextLine();
		
		
		
		scanner.close();
	}

}
