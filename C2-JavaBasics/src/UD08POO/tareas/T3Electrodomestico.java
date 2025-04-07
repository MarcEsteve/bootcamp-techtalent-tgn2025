package UD08POO.tareas;

public class T3Electrodomestico {

	// CONSTANTES
	private final static double PRECIO_BASE_PRED = 100;
	private final static ColorEnum COLOR_PRED = ColorEnum.BLANCO;
	private final static ConsumoEnum CONSUMO_ENERGETICO_PRED = ConsumoEnum.F;
	private final static double PESO_PRED = 5;

	// Atributos
	protected double precioBase;
	protected ColorEnum color;
	protected ConsumoEnum consumoEnergetico;
	protected double peso;

	public enum ColorEnum {
		BLANCO, NEGRO, ROJO, AZUL, GRIS // enumeracion de constantes colores.
										// solo puede tomar los valores de la
										// enumeracion.
	}

	// !!la enumeracion es muy util cuando hay que representar un conjunto FIJO de
	// constantes!!
	// !!also, el ENUM detecta errores al intentar ingresar un valor que no esta
	// definido en la enumeracion.
	public enum ConsumoEnum { // enumeracion de constantes consumo.
								// solo puede tomar los valores de la
								// enumeracion.
		A, B, C, D, E, F // !!also, claridad en el codigo, mas legible
	}

	// Contructores
	public T3Electrodomestico() {
		this.precioBase = PRECIO_BASE_PRED;
		this.color = COLOR_PRED;
		this.consumoEnergetico = CONSUMO_ENERGETICO_PRED;
		this.peso = PESO_PRED;
	}

	public T3Electrodomestico(double precio, double peso) {
		this();
		this.precioBase = precio;
		this.peso = peso;
	}

	public T3Electrodomestico(double precio, double peso, ColorEnum color, ConsumoEnum consumoEnergetico) {
		this.precioBase = precio;
		this.peso = peso;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public ColorEnum getColor() {
		return color;
	}

	public void setColor(ColorEnum color) {
		this.color = color;
	}

	public ConsumoEnum getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(ConsumoEnum consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public static double getPrecioBasePred() {
		return PRECIO_BASE_PRED;
	}

	public static ColorEnum getColorPred() {
		return COLOR_PRED;
	}

	public static ConsumoEnum getConsumoEnergeticoPred() {
		return CONSUMO_ENERGETICO_PRED;
	}

	public static double getPesoPred() {
		return PESO_PRED;
	}

	// Constructor si no tuvieramos ENUM
//	public Electrodomestico(String color, double precio, char consumo, double peso) {
//        this.precio = precio;
//
//        if           (!color.equalsIgnoreCase("azul") 
//                && !color.equalsIgnoreCase("rojo") 
//                && !color.equalsIgnoreCase("blanco")
//                && !color.equalsIgnoreCase("negro") 
//                && !color.equalsIgnoreCase("gris")) {
//            this.color = COLOR_DEFECTO;
//        } else {
//            this.color = color;
//
//        }
//        //consumo = a o a f
//        if (consumo < 'A' || consumo > 'F') {
//            this.consumo = LETRA_CONSUMO;
//        } else {
//            this.consumo = consumo;
//        }
//        this.peso = peso;
//    }
	
	

}