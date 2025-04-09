package UD09Herencia.tareas.Ej1;

public class ElectroMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomesticos electrodomestico1 = new Electrodomesticos();
		System.out.println("Electrodomestico 1:");
		System.out.println(electrodomestico1);
		System.out.println("Precio final: " + electrodomestico1.precioFinal() + " €");

		Electrodomesticos electrodomestico2 = new Electrodomesticos(150, 7);
		System.out.println("\nElectrodomestico 2:");
		System.out.println(electrodomestico2);
		System.out.println("Precio final: " + electrodomestico2.precioFinal() + " €");

		Electrodomesticos electrodomestico3 = new Electrodomesticos(200, 8, "azul", 'A');
		System.out.println("\nElectrodomestico 3:");
		System.out.println(electrodomestico3);
		System.out.println("Precio final: " + electrodomestico3.precioFinal() + " €");

		Lavadora lavadora1 = new Lavadora();
		System.out.println("Lavadora 1:");
		System.out.println(lavadora1);
		System.out.println("Precio final: " + lavadora1.precioFinal() + " €");

		Lavadora lavadora2 = new Lavadora(150, 7);
		System.out.println("\nLavadora 2:");
		System.out.println(lavadora2);
		System.out.println("Precio final: " + lavadora2.precioFinal() + " €");

		Lavadora lavadora3 = new Lavadora(40, 200, 8, "azul", 'A');
		System.out.println("\nLavadora 3:");
		System.out.println(lavadora3);
		System.out.println("Precio final: " + lavadora3.precioFinal() + " €");

		Television television1 = new Television();
		System.out.println("Televisión 1:");
		System.out.println(television1);
		System.out.println("Precio final: " + television1.precioFinal() + " €");

		Television television2 = new Television(150, 7);
		System.out.println("\nTelevisión 2:");
		System.out.println(television2);
		System.out.println("Precio final: " + television2.precioFinal() + " €");

		Television television3 = new Television(50, true, 200, 8, "azul", 'A');
		System.out.println("\nTelevisión 3:");
		System.out.println(television3);
		System.out.println("Precio final: " + television3.precioFinal() + " €");
	}

}
