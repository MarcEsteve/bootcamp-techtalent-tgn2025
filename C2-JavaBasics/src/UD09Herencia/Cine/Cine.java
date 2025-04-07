package UD09Herencia.Cine;

// Repositorio GitHub
//https://github.com/Anatagora/TechTalent-java/tree/main/C2-JavaBasics/src/UD9/ejercicio6
// Ejercicio 6

public class Cine {

	private Peliculas pelicula;
	private double precio;
	private int filas;
	private int columnas;

	public Cine() {
		this.pelicula = new Peliculas();
		this.precio = 10;
		this.filas = 8;
		this.columnas = 8;
	}

	public Cine(Peliculas pelicula, double precio, int filas, int columnas) {
		this.pelicula = pelicula;
		this.precio = precio;
		this.filas = filas;
		this.columnas = columnas;
	}

	public Peliculas getPelicula() {
		return pelicula;
	}

	public void setPelicula(Peliculas pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	@Override
	public String toString() {
		return "En el cine se esta reproduciento la pelicula " + pelicula + ". Le entrada tiene un precio de " + precio
				+ "€." + "La sala de cine tiene" + filas + "filas " + " y " + columnas + "columnas.";
	}
}