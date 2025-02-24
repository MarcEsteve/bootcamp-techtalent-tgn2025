package UD05FlujoDatos.tareas;

public class T5Ej01App {

	public static void main(String[] args) {
//		Declara 2 variables numéricas (con el valor que desees), 
//		he indica cual es mayor de los	dos. Si son iguales indicarlo 
//		también. Ves cambiando los valores para comprobar que funciona
		
		int num1 = 5;
		int num2 = 13;
		
		boolean esMayor = num1 > num2;
		boolean esMenor = num1 < num2;
		boolean sonIguales = num1 == num2;
		
		System.out.println("El número " + num1 + " es mayor que " + num2 + ": " + esMayor);
		System.out.println("El número " + num1 + " es menor que " + num2 + ": " + esMenor);
		System.out.println("Los números son iguales: " + sonIguales);
		
//		Bloque condicional
		
//		if (num1 > num2) {
//			//Este código se ejecuta si la condición es verdadera
//			System.out.println("El número " + num1 + " es mayor que " + num2);
//		} else if (num1 < num2) {
//			//Este código se ejecuta si el num2 es mayor que num1
//			System.out.println("El número " + num2 + " es mayor que " + num1);
//		} else {
//			//Este código se ejecuta si las otras condiciones son falsas
//			System.out.println("Los números son iguales");
//		}
		

		//		Operador ternario
//		num1 > num2 ? System.out.println("El número " + num1 + " es mayor que " + num2) : num1 < num2 ? System.out.println("El número " + num2 + " es mayor que " + num1) : System.out.println("Los números son iguales");
		

	}

}
