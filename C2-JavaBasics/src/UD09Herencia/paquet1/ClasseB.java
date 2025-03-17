package UD09Herencia.paquet1;

public class ClasseB {
	public void provaAcces() {
        ClasseA a = new ClasseA();
        // a.metodePrivat(); // ❌ Error: no és accessible
        a.metodeDefault();    // ✅ mateix paquet
        a.metodeProtegit();   // ✅ mateix paquet
        a.metodePublic();     // ✅ sempre accessible
    }
}
