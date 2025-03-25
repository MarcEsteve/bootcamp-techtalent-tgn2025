package UD09Herencia.paquet1;

public class ClasseA {
	// Mètodes amb diferents modificadors d'accés
	
	// privat: accessible només dins de la classe
	private void metodePrivat() {
		System.out.println("Privat: Només accessible dins de ClasseA");
	}
	// default: accessible dins del mateix paquet
	void metodeDefault() {
		System.out.println("Default: Accessible dins del mateix paquet");
	}
	
	// protegit: accessible dins del mateix paquet i per subclasses en altres paquets
	protected void metodeProtegit() {
		System.out.println("Protected: Accessible des del mateix paquet i per subclasses en altres paquets");
	}

	// public: accessible des de qualsevol lloc
	public void metodePublic() {
		System.out.println("Public: Accessible des de qualsevol lloc");
	}
	// Mètode per provar l'accés als mètodes
	public void provarMetodes() {
		metodePrivat();
		metodeDefault();
		metodeProtegit();
		metodePublic();
	}
}
