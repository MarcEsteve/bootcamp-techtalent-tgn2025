package UD05FlujoDatos;

public class UD05MathMetodosApp {

	public static void main(String[] args) {
		// abs(double a)
		double numAbs = -10.5;
		double absNum = Math.abs(numAbs);
		System.out.println("El valor absoluto de " + numAbs + " es " + absNum);

		// sqrt(double a)
		double numSqrt = 25;
		double sqrtNum = Math.sqrt(numSqrt);
		System.out.println("La raíz cuadrada de " + numSqrt + " es " + sqrtNum);

		// pow(double a, double b)
		double base = 2;
		double exponente = 3;
		double resultadoPotencia = Math.pow(base, exponente);
		System.out.println(base + " elevado a la potencia " + exponente + " es " 
						    + resultadoPotencia);

		// round(double a)
		double numRound = 5.4;
		double roundNum = Math.round(numRound);
		System.out.println("El redondeo de " + numRound + " es " + roundNum);
		double numRound2 = 5.6894;
		System.out.println("Redondeo de dos cifras decimales: " +
					Math.round(numRound2 * 100) / 100.0);
		

		// ceil(double a) y floor(double a)
		double numCeilFloor = 5.7;
		double ceilNum = Math.ceil(numCeilFloor);
		double floorNum = Math.floor(numCeilFloor);
		System.out.println("El techo de " + numCeilFloor + " es " + ceilNum);
		System.out.println("El piso de " + numCeilFloor + " es " + floorNum);
		

		// random()
		double randomNum = Math.random();
		System.out.println("Número aleatorio entre 0.0 y 1.0: " + randomNum);
		System.out.println("Número aleatorio entre 0 y 100000: " 
						+ (int) (randomNum * 100000));
//		A pseudorandom double greater than or equalto 0.0 and less than 1.0.

	}

}
