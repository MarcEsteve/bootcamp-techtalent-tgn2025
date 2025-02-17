
public class OpUnariosApp {

	public static void main(String[] args) {
		int op1 = 10, x=0;
		
//		Equivalentes:
//		x++;
//		++x;
//		x = x + 1; 
		
		op1++; // Incremento en una unidad 11
		++op1; // 12
		op1--; // Decremento en una unidad 11
		System.out.println(op1);
		
		x = op1++;
		System.out.println("La x vale: " + x 
				+ " y el operador 1 vale: " + op1); //op1 es 12
		x = ++op1; //
		System.out.println("La x vale: " + x 
				+ " y el operador 1 vale: " + op1);

	}

}
