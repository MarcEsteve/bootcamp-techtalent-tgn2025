package UD09Herencia;

public class Repartidor extends Empleado {
	private static String identificacion;
	// Atributos (hereda de Empleado + los propios)
	private String zona;

	// Constructores
	public Repartidor() {
		this.nombre = ".";
		this.apellido = "otrovalor";
		this.edad = 16;
		this.salario = SALARIO_DEF;
		this.zona = "";
	}

	public Repartidor(String name, String surname, int age, double account, String alcance) {
		super(name, surname, age, account, identificacion);
		this.zona = alcance;
	}

	// Sobreescritura de métodos
	public boolean plus(double sueldoPlus) {
		boolean aumento = false;
		if (edad > 40) {
			salario += sueldoPlus;
			aumento = true;
		}
		return aumento;
	}

}
