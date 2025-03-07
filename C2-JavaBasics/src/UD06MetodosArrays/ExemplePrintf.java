package UD06MetodosArrays;

public class ExemplePrintf {

	public static void main(String[] args) {
		// Enter (int i long)
        int numInt = 42;
        long numLong = 9876543210L;
        System.out.printf("Número enter: %d%n", numInt);
        System.out.printf("Número long: %d%n", numLong);
        int a = 10, b = 20, c = 30;
        System.out.printf("Els valors són: a = %d, b = %d, c = %d%n", a, b, c);
        System.out.printf("La suma de %d i %d és %d%n", a, b, a + b);
        System.out.printf("El producte de %d * %d * %d és %d%n", a, b, c, a * b * c);

        System.out.println("El producte de "+a+" * "+b+" * "+c+" és "+ (a * b * c));

        // Decimal (float i double)
        float numFloat = 3.1415f;
        double numDouble = 12345.6789;
        System.out.printf("Número float: %.2f%n", numFloat);  // %.2f -> 2 decimals
        System.out.printf("Número double: %.4f%n", numDouble); // %.4f -> 4 decimals

        // Caràcter
        char lletra = 'A';
        System.out.printf("Caràcter: %c%n", lletra);

        // Cadena de text (String)
        String text = "Hola, Java!";
        System.out.printf("Cadena de text: %s%n", text);

        // Booleà
        boolean esCert = true;
        System.out.printf("Valor booleà: %b%n", esCert);

        // Representació hexadecimal i octal
        int numHex = 255;
        System.out.printf("Hexadecimal de 255: %x%n", numHex);
        System.out.printf("Octal de 255: %o%n", numHex);

        // Formatant números amb espais i zeros
        int numFormat = 7;
        System.out.printf("Número amb espais: %5d%n", numFormat);  // 5 espais abans
        System.out.printf("Número amb zeros: %03d%n", numFormat);  // 007

        // Concatenació de printf (NO és correcte usar .println())
        System.out.printf("El número %d és primer o <=1%n", numInt);

	}

}
