package UD06MetodosArrays;

public class MetodoBoolean {

	public static void main(String[] args) {

		int operador1=-8, operador2=5;
			
		if (positivoEntero(operador1,operador2)) {
			System.out.println("Entero positivo o zero");
		} else {
			System.out.println("Entero negativo");
		}

	}
	
	public static boolean positivoEntero(int num1, int num2) {
		int result = num1 + num2;
		
		if (result >= 0) {
			return true;
		} else {
			return false;
		}
	}

}
