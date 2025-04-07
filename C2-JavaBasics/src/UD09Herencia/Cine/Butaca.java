package UD09Herencia.Cine;

public class Butaca {
	private int fila;
	private char columna;
	private boolean ocupado;

	public Butaca() {
		this.fila = 0;
		this.columna = 'A';
		this.ocupado = false;
	}

	public Butaca(int fila, char columna, boolean ocupado) {
		this.fila = fila;
		this.columna = columna;
		this.ocupado = ocupado;
	}

	public int getfila() {
		return fila;
	}

	public void setfila(int fila) {
		this.fila = fila;
	}

	public char getcolumna() {
		return columna;
	}

	public void setcolumna(char columna) {
		this.columna = columna;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void ocuparAsiento() {
		this.ocupado = true;
	}

	@Override
	public String toString() {
		return "La butaca " + fila + columna + "¿Esta ocupada?" + ocupado + ".";
	}
}
