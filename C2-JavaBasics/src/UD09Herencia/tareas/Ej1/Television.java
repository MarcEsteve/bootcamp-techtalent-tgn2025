package UD09Herencia.tareas.Ej1;

public class Television extends Electrodomesticos {
	// Constantes
	private static final double RESOLUCION_DEFAULT = 20;
	private static final boolean SINTONIZADOR_TDT_DEFAULT = false;
	private static final double PORCENTAJE_INCREMENTO_RESOLUCION = 0.3;
	private static final double PRECIO_INCREMENTO_SINTONIZADOR_TDT = 50;

	// Atributos
	private double resolucion;
	private boolean sintonizadorTDT;

	// Constructores
	public Television() {
		this.precioBase = PRECIO_BASE_DEFAULT;
		this.peso = PESO_DEFAULT;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
		this.resolucion = RESOLUCION_DEFAULT;
		//super();
		this.sintonizadorTDT = SINTONIZADOR_TDT_DEFAULT;
	}

	public Television(double precioBase, double peso) {

		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
		this.resolucion = RESOLUCION_DEFAULT;
		this.sintonizadorTDT = SINTONIZADOR_TDT_DEFAULT;

	}

	public Television(double resolucion, boolean sintonizadorTDT, double precioBase, 
							double peso, String color, char consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	// Métodos get de resolución y sintonizador TDT
	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() { //getSintonizadorTDT()
		return sintonizadorTDT;
	}

	// Método precioFinal()
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();

		if (resolucion > 40) {
			precioFinal *= (1 + PORCENTAJE_INCREMENTO_RESOLUCION);
//			precio = precio*1.3;
		}

		if (sintonizadorTDT) {
			precioFinal += PRECIO_INCREMENTO_SINTONIZADOR_TDT;
		}

		return precioFinal;
	}
	
	@Override
	public String toString() {
		return "Precio base: " + precioBase + " €\nColor: " + color 
				+ "\nConsumo energético: " + consumoEnergetico
				+ "\nPeso: " + peso + " kg"
				+ "\nResolucion: " + resolucion + " pulgadas"
				+ "\nTDT: " + sintonizadorTDT;
	}

}