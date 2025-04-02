package UD09Herencia;

public class AnimalApp {

	public static void main(String[] args) {
        Animal a1 = new Gos();  // Polimorfisme: referència Animal, objecte Gos
        Animal a2 = new Gat();

        a1.ferSo();  // Bup bup!
        a2.ferSo();  // Miau!

	}

}
