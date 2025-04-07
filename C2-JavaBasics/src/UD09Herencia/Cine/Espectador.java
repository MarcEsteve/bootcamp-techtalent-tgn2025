package UD09Herencia.Cine;

public class Espectador {
	private String nombre;
	private int edad;
	private double dinero;

	public Espectador() {
		generarEspectadorRandom();
	}

	public Espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	public void generarEspectadorRandom() {
		Lista_de_Nombres[] nombres = Lista_de_Nombres.values();
		int random = (int) (Math.random() * 40);
		this.nombre = nombres[random].toString();

		random = (int) (Math.random() * 100);
		this.edad = random;

		double r = Math.random() * 100;
		this.dinero = r;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}
}
