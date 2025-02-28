package UD06MetodosArrays;

import javax.swing.JOptionPane;

public class MetodoSumar {

	public static void main(String[] args) {
		
		int argumento1=0, argumento2=0;
		
		argumento1 = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "Introduce el primer número: "));
		argumento2 = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "Introduce el segundo número: "));
		
		System.out.println("El resultado de la suma es: " 
					+ sumar(argumento1, argumento2));
		//Llamada al método sumar()
		// parametro1 = argumento1
		// parametro2 = argumento2

	}

	public static int sumar(int parametro1, int parametro2) {
		return parametro1 + parametro2;
	}
}
