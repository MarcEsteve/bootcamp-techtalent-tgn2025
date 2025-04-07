package UD09Herencia.Cine;

public class Peliculas {

	private String titulo;
	private int duracion;
	private int edadMinima;
	private String director;

	public Peliculas() {
		this.titulo = "none";
		this.duracion = 0;
		this.edadMinima = 0;
		this.director = "none";
	}

	public Peliculas(String titulo, int duracion, int edadMinima, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "La pelicula " + titulo + "tiene una duracion de" + duracion + " minutos,  "
				+ " la edad minima para visualizarla es " + edadMinima + "y su director es " + director + ".";
	}
}