package UD04JavaBasics.tareas;

public class T4Ejercicio4App {
	
	public static void main(String[] args) {
		
		int N = 29;
		
		System.out.println("Valor inicial de N es " + N);
//		int incremento77 = N + 77; // Guardar el valor inicial de N
//		N += 77;
//		N = N + 77;
		System.out.println("Incrementar en 77 N es " + (N += 77) );
		System.out.println(N);
		System.out.println("Descrementar en 3 N es " + (N -= 3) );
//		N -= 3;
//		N = N - 3;
		System.out.println(N);
		System.out.println("Duplicar N es " + (N *= 2) );
//		N *= 2;
//		N = N * 2;
		System.out.println(N);
		
		
	}
		
}
