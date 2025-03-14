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

		//Ejemplo de cálculo directo
//		System.out.println("La conversió de " + valor + " € són "
//				+ "\n£" + (valor * 0.84) 	+ " (libras)"
//				+ "\n$" + (valor * 1.09) + " (dólares)"+ "\n¥" + (valor * 162.09) 
//				+ " (yenes)");
		
		//Filtro de divisa correcta solo si yo escribo "libras, yenes o dolares" correctamente 
		// Me deja continuar con el código
		do {
			System.out.println("Indica a quina divisa vols convertir:");
			System.out.println("libras");
			System.out.println("dolares");
			System.out.println("yenes"); // assignem el valor
			divisa = valorConsole.nextLine();
			divisa = divisa.toLowerCase();
		} while (!divisa.equals("libras") 
				 && !divisa.equals("dolares") 
				 && !divisa.equals("yenes"));

		//Revisando cada "case" segun la divisa
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
				System.out.println("Divisa no reconocida.");
				break;
		}
		System.out.println("Valor actual a  14/03/2025");
		valorConsole.close();

	}

	private static void convertirEuroLibras(int valor) {
		System.out.println("La conversió de " + valor + " € són £" + (valor * 0.84) 
				+ " (libras)");
	}

	private static void convertirEuroDolares(int valor) {
		System.out.println("La conversió de " + valor + " € són $" + (valor * 1.09) 
				+ " (dólares)");
	}

	private static void convertirEuroYenes(int valor) {
		System.out.println("La conversió de " + valor + " € són ¥" + (valor * 162.09) 
				+ " (yenes)");
	}

}
