package UD05FlujoDatos;

public class PetarEclipse2 {

	public static void main(String[] args) {

//		 while (true) {
//	            // Codi infinit sense cap espera
//	     }
		for (int i = 0; i < Runtime.getRuntime().availableProcessors(); i++) {
			new Thread(() -> {
				while (true) {
				}
			}).start();
		}
	}

}
