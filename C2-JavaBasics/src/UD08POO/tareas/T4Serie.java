package UD08POO.tareas;

public class T4Serie {
	// Atributos
	private String titulo;
	private int nTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	private final int TEMPORADAS_DEF = 3;
	private final boolean ENTREGADO_DEF = false;

	// Constructores
	public T4Serie() {
		this.titulo = "";
		this.nTemporadas = TEMPORADAS_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = "";
		this.creador = "";
	}

	public T4Serie(String nombre, String director) {
		this(); // En este caso hace referencia a nTemporadas, entregado y genero Serie()
		// Equivalente
//		this.nTemporadas = TEMPORADAS_DEF;
//		this.entregado = ENTREGADO_DEF;
//		this.genero = "";
		this.titulo = nombre;
		this.creador = director;
	}
	// new Serie("Juego de Tronos", "David Benioff");

	public T4Serie(String nombre, int temp, String gendre, String director) {
		this();
//         this.entregado = false;//Equivalente
		this.titulo = nombre;
		this.nTemporadas = temp;
		this.genero = gendre;
		this.creador = director;

	}
    // Métodos getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getnTemporadas() {
		return nTemporadas;
	}

	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
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

	public int getTEMPORADAS_DEF() {
		return TEMPORADAS_DEF;
	}

	public boolean isENTREGADO_DEF() {
		return ENTREGADO_DEF;
	}
}
