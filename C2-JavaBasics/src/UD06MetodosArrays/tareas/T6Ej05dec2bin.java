package UD06MetodosArrays.tareas;

import java.util.Scanner;

public class T6Ej05dec2bin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		String num = sc.nextLine();
		int numero = Integer.parseInt(num);
		
		
		System.out.println(binario(numero));
//		System.out.println("El binario generado es: " + dec2bin(numero));

		sc.close();
	}

	public static String binario(int n1) {
		String result = "";
		int resto;
		do {
			resto = n1 % 2;
			n1 = n1 / 2;
			result = resto + result;
		} while (n1 > 0);

		return result;
	}

	public static String dec2bin(int decimal) {

		if (decimal == 0) {
			return "0";
		}

		StringBuilder binario = new StringBuilder();

		do {
			int residuo = decimal % 2;
			binario.insert(0, residuo);
			decimal = decimal / 2;
			System.out.println(residuo + " " + decimal);

		} while (decimal > 0);
		return binario.toString(); // StringBuilder --> String
	}

}
