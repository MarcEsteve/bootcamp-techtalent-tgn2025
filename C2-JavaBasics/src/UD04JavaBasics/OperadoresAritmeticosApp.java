package UD04JavaBasics;

public class OperadoresAritmeticosApp {

	public static void main(String[] args) {

		double op1 = 20.0, op2 = 15.0, result = 0.0; 
		
//		int op1 = 20;
//		int op2 = 15;
//		int result = 0;
		
		result = op1 + op2;
		System.out.println("La suma de op1 y op2 es " + result);
		result = op1 - op2;
		System.out.println("La resta de op1 y op2 es " + result);
		result = op1 * op2;
		System.out.println("La multiplicación de op1 y op2 es " + result);
		result = op1 / op2;
		System.out.println("La división de op1 y op2 es " + result);
		result = op1 % op2;
		System.out.println("El resto de op1 y op2 es " + result);

	}

}
