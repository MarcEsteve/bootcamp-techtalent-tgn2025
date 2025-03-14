package UD06MetodosArrays.tareas;

import java.util.Scanner;

public class T6Ej07ConversorEuros {

	public static void main(String[] args) {
//		Crea una aplicación que nos convierta una cantidad de euros introducida por teclado a otra
//		moneda, estas pueden ser a dolares, yenes o libras. El método tendrá como parámetros, la
//		cantidad de euros y la moneda a pasar que sera una cadena, este no devolverá ningún valor,
//		mostrara un mensaje indicando el cambio (void).
//		El cambio de divisas son:
//			• 0.86 libras es un 1 €
//			• 1.28611 $ es un 1 €
//			• 129.852 yenes es un 1 €

		Scanner valorConsole = new Scanner(System.in);
		String divisa = "";
		int valor = 0;

		System.out.println("Pasa un valor en euros:");
		valor = valorConsole.nextInt();
		valorConsole.nextLine(); // Netegem el \n

		System.out.println("Indica a quina divisa vols convertir:");
		System.out.println("libras");
		System.out.println("dolares");
		System.out.println("yenes");
		divisa = valorConsole.nextLine();
		divisa = divisa.toLowerCase(); // assignem el valor

		switch (divisa) {
		case "libras":
			convertirEuroLibras(valor);
			break;
		case "dolares":
			convertirEuroDolares(valor);
			break;
		case "yenes":
			convertirEuroYenes(valor);
			break;
		default:
			System.out.println("Divisa no reconeguda.");
			break;
		}

		valorConsole.close();

	}

	private static void convertirEuroLibras(int valor) {
		System.out.println("La conversió de " + valor + " € són " + (valor * 0.86) + " libras");
	}

	private static void convertirEuroDolares(int valor) {
		System.out.println("La conversió de " + valor + " € són " + (valor * 1.28611) + " dólares");
	}

	private static void convertirEuroYenes(int valor) {
		System.out.println("La conversió de " + valor + " € són " + (valor * 129.852) + " yenes");
	}

}
