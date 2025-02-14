
public class ConstantesApp {

	public static void main(String[] args) {
		final double IVA = 0.18;
		int producto = 300;
//		IVA = 0.21; A las Constantes no se les puede reasignar valor
		double resultado = producto * IVA;
		System.out.println("El IVA del producto es " + resultado);
		System.out.println("Esto es un cambio desde Eclipse en su WorkSpace "
				+ "dentro de mi repositorio LOCAL sincronizado con Github.com");
		
	}

}
