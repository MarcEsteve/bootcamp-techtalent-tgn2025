package UD09Herencia.tareas.Ej2;

public class Serie {
	
//	Crearemos una clase llamada Serie con las siguientes características:
//	• Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
//	• Por defecto, el numero de temporadas es de 3 temporadas y entregado false.
//	El resto de atributos serán valores por defecto según el tipo del atributo.
//	Los constructores que se implementaran serán:
//	✓ Un constructor por defecto.
//	✓ Un constructor con el titulo y creador. El resto por defecto.
//	✓ Un constructor con todos los atributos, excepto de entregado.
//	Los métodos que se implementara serán:
//	• Métodos get de todos los atributos, excepto de entregado.
//	• Métodos set de todos los atributos, excepto de entregado.
//	• Sobrescribe los métodos toString.
	
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
}
