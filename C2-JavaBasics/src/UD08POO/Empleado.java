package UD08POO;

public class Empleado {

	// Atributos "Variables dentro de OBJECTOS Class"
	private String nombre;
	private String apellido;
	private int edad;
	private double salario;
	final private static double SALARIO_DEF = 1000.0;

	// Constructores

//	public Empleado() {
//		this.nombre = "";
//		this.apellido = "";
//		this.edad = 0;
//		this.salario = 0.0;
//	}
////	
//	Equivalente del contructor por defecto simplificado:
	public Empleado() {
		this("", "", 0, SALARIO_DEF);
	}

//	2 parámentros
	public Empleado(String name, String surname) {
		this.nombre = name;
		this.apellido = surname;
		this.edad = 0;
		this.salario = SALARIO_DEF;
	}

//	3 parámetros
	public Empleado(String name, String surname, int age) {
//		this.nombre = name;
//		this.apellido = surname;
//		this.edad = age;
//		this.salario = SALARIO_DEF;
		this(name, surname, age, SALARIO_DEF);
	}

// 4 parámentros
	public Empleado(String name, String surname, int age, double account) {
//		super();
		this.nombre = name;
		this.apellido = surname;
		this.edad = age;
		this.salario = account;
	}

	// Métodos
	public boolean plus(double sueldoPlus) {
		boolean aumento = false;
		if (edad > 40) {
			salario += sueldoPlus;
			aumento = true;
		}
		return aumento;
	}
	
	//Sobrecarga de equals()

	public boolean equals(Empleado a) {
		if (a.getNombre().equals(nombre) && a.getApellido().equals(apellido)) {
			return true;
		} else {
			return false;
		}
	}

	// Getters y Setters
	
	//Sintaxis de Getters: nombre del atributo y añadir la palabra "get" + inicial del atributo en mayúscula
	//Sintaxis de Setters: nombre del atributo y añadir la palabra "set" + inicial del atributo en mayúscula

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
