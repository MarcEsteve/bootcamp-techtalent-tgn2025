package UD05FlujoDatos;

public class UD05BucleForApp {

	public static void main(String[] args) {

		for (int num = 1; num <=5; num++) {
			System.out.println(num);
			//Acciones dentro del bucle for
		}
        System.out.println("Fuera del bucle for");
        for (int num = 0; num < 100; num+=5) {
			System.out.println(num);
			//Acciones dentro del bucle for
			//num = num + 5;
			//num+=5; (Más eficiente)
		}
        System.out.println("Fuera del bucle for incrementado en 5 hasta 95");
	}

}
