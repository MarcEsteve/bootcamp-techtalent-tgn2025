package UD09Herencia.paquet2;

import UD09Herencia.paquet1.ClasseA;

public class ClasseE extends ClasseA {
	public void provaAcces() {
        // metodePrivat();      // ❌ No accessible, ni com a subclasse
        // metodeDefault();     // ❌ No accessible (altre paquet)
        metodeProtegit();       // ✅ Accessible com a subclasse
        metodePublic();         // ✅ Accessible
    }
}
