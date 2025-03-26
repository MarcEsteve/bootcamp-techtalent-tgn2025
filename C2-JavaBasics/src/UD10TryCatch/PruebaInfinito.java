package UD10TryCatch;

public class PruebaInfinito {

	public static void main(String[] args) {
		int div = 0;

//		int a = 12, b = 0;
//		div = a / b;

		try {
			int a = 12, b = 0;
			div = a / b;
		} catch (Exception e) {
			System.out.println("No puedes dividir por zero!!!");
			System.out.println(e.getMessage());
		}

		System.out.println("El resultado es " + div);

	}

}
