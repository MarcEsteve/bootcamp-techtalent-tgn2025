package UD10TryCatch;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExempleTryCatchFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introdueix un número enter: ");
            int numero = scanner.nextInt();  // pot fallar si s'introdueix text
            System.out.println("Has introduït el número: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("⚠️ Error: no has introduït un número vàlid.");
        } finally {
            System.out.println("✅ Bloc finally executat: tanquem l'escàner.");
            scanner.close(); // tanca el recurs encara que hi hagi hagut error
        }
       

        System.out.println("Fi del programa.");
    }
}
