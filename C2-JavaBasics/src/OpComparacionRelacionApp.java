
public class OpComparacionRelacionApp {

	public static void main(String[] args) {
		int op1 = 10, op2 = 20, op3 = 30;
		boolean result = false;
		
		result = (op1 == op2);
//		System.out.println(result);
		result = (op1 != op2);
//		System.out.println(result);
		
//		Operadores lógicos "condicionales" AND && y OR ||
		result = (op1 > 3 && op2 < 15);
		System.out.println(result);
		
		
//		EXTRA
//		Ejemplo de importancia en algunos casos del paréntesis
//		System.out.println("El resultado de la suma es " + (op1 + op2));
		

	}

}
