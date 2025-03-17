package UD09Herencia;

public class Comercial extends Empleado {
	// Atributos (hereda de Empleado + los propios)
	private double comision;

	// Constructores
	public Comercial() {
		super();
		this.comision = 0;
	}

	public Comercial(String name, String surname, int age, double account, double comi) {
		this.nombre = name;
		this.apellido = surname;
		this.edad = age;
		this.salario = account;
		this.comision = comi;
	}

	// Sobreescritura de métodos
	public boolean plus(double sueldoPlus) {
		boolean aumento = false;
		if (comision < 50) {
			salario += sueldoPlus;
			aumento = true;
		}
		return aumento;
	}
}
