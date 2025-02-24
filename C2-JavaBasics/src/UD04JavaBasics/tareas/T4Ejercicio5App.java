package UD04JavaBasics.tareas;

public class T4Ejercicio5App {

	public static void main(String[] args) {

		int A=3, B=7, C=13 , D=27;
		int B1= B;
		
        // Muestra el valor de cada variable
        System.out.println("Valores iniciales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        
        // Ahora asignamos las referencias a otras variables
		B=C;
		System.out.println("Asigno a B igual a C y tenemos B igual a " + (B));
		C=A;
		System.out.println("Asigno a C igual a A y tenemos B igual a " + (C));
		A=D;
		System.out.println("Asigno a A igual a D y tenemos B igual a " + (A));
		D=B1;
		System.out.println("Asigno a D igual a B y tenemos D igual a " + (D));

	}

}
