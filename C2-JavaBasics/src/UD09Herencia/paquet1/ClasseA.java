package UD09Herencia.paquet1;

public class ClasseA {
	private void metodePrivat() {
		System.out.println("Privat: Només accessible dins de ClasseA");
	}

	void metodeDefault() {
		System.out.println("Default: Accessible dins del mateix paquet");
	}

	protected void metodeProtegit() {
		System.out.println("Protected: Accessible des del mateix paquet i per subclasses en altres paquets");
	}

	public void metodePublic() {
		System.out.println("Public: Accessible des de qualsevol lloc");
	}

	public void provarMetodes() {
		metodePrivat();
		metodeDefault();
		metodeProtegit();
		metodePublic();
	}
}
