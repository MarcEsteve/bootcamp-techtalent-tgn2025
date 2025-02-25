package UD05FlujoDatos;

public class UD05CondicionalIfApp {

	public static void main(String[] args) {
		
		int numero = 0, precio=80, hora=11, nota=7;
		
//		if (numero > 0) {
//			System.out.println("El número es positivo");
//		}
//		
//		if (numero < 0) {
//			System.out.println("El número es negativo");
//		}
//		
//		if (numero >= 0) {
//            System.out.println("El número es 0");
//		}
		
//		if (numero > 0) {
//			System.out.println("El número es positivo");
//		} else {
//			System.out.println("El número es negativo");
//		}

		
		//Un bloque condicional
		if (precio>100) {
			System.out.println("El precio es mayor que 100");
		} else if((precio <=100) && (precio>=80)) {
			System.out.println("El precio es entre 80 y 100 incluidos");
		} else  {
			System.out.println("El precio es inferior 80");
		}
		
		//Bloque condicional de notas
		if (nota >= 9) {
			System.out.println("Excelente");
		} else if (nota >= 7) {
			System.out.println("Notable");
		} else if (nota >= 5) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Suspendido");
		}
		
		System.out.println("Código finalizado");
	}

}
