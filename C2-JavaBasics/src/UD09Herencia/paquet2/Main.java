package UD09Herencia.paquet2;

import UD09Herencia.paquet1.ClasseA;

public class Main {

	public static void main(String[] args) {
		ClasseA a = new ClasseA();
		// a.metodePrivat(); // ❌ No accessible
		// a.metodeDefault(); // ❌ No accessible
		// a.metodeProtegit(); // ❌ No accessible (no és subclasse aquí)
		a.metodePublic(); // ✅ Accessible des de qualsevol lloc
		System.out.println("\nCrida a provarMetodes() des de Main:");
		a.provarMetodes();
	}

}
