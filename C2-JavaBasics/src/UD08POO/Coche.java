package UD08POO;

public class Coche {
	// Atributos
	public String marca;
	public String modelo;
	public int any;
	public String color;

	// Constructor por defecto
	public Coche() {
		this.marca = "(sin marca)";
		this.modelo = "(sin modelo)";
		this.any = 0;
		this.color = "(sin color)";
		// this ("","(sin modelo)", 0, "");
	}

	public Coche(String trademark) {
		this.marca = trademark;
		this.modelo = "(sin modelo)";
		this.any = 0;
		this.color = "";
	}

	public Coche(String marca, int any) {

		this.any = any;
		this.marca = marca;
		this.modelo = "vacio";
		this.color = "";
	}

	// Sobreescritura de Constructores
	// NO se pueden crear dos contructores con los mismos parámentros Y tipos

//	public Coche(String marca, String color) {
//
//		this.any = 0;
//		this.marca = marca;
//		this.modelo = "";
//		this.color = color;
//	}

	public Coche(String modelo, String color) {

		this.any = 0;
		this.marca = "";
		this.modelo = modelo;
		this.color = color;
	}

//	public Coche(String color, String modelo, int any) {
//		this.marca = "";
//		this.modelo = modelo;
//		this.any = any;
//		this.color = color;
//	}

	public Coche(int pepito, String juanito, String medaigual, String ultimo) {
		this.marca = medaigual;
		this.modelo = juanito;
		this.any = pepito;
		this.color = ultimo;
	}

	// Métodos
	public void arrancar() {
		System.out.println("El coche " + marca + " " + modelo + " ha arrancado.");
	}

	public void detener() {
		System.out.println("El coche " + marca + " " + modelo + " se ha detenido.");
	}

	public void acelerar() {
		System.out.println("El coche " + marca + " " + modelo + " está acelerando.");
	}

	public void frenar() {
		System.out.println("El coche " + marca + " " + modelo + " está frenando.");
	}

}
