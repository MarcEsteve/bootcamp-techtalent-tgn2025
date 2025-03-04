package UD05FlujoDatos.tareas;

public class T5Ej07App {

	public static void main(String[] args) {
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		...
//		System.out.println(100);
		int iterador = 1;
		System.out.println("Primer while()");

		while (iterador <= 100) {
			System.out.println(iterador);
			iterador++;
		}

		int i = 0; //Inicialización normal de "integers" enteros
		System.out.println("Segundo while()");
		while (i < 100) {
			i++;
			System.out.println(i);
		}
	}

}
