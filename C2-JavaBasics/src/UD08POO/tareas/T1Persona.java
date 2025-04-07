package UD08POO.tareas;

public class T1Persona {

	// Atributos
	private String nombre;
	private int edad;
	private String DNI;
	private final char sexo;
	private double peso;
	private double altura;
	private String email;
	
	//Constantes
	public static final char SEXO_HOMBRE = 'H';

	// Constructores
	public T1Persona() {
		this.nombre = "";
		this.edad = 0;
		this.DNI = "xxxxxxxxC";
		this.sexo = SEXO_HOMBRE;
		this.peso = 0;
		this.altura = 0;
		this.email = "";
	}
	
	public T1Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = " xxxxxxxxC ";
		this.sexo = SEXO_HOMBRE;
		this.peso = 0.0;
		this.altura = 0.0;
		this.email = "";
	}

	public T1Persona(String nombre, int edad, String dni, 
					char sexo, double peso, double altura, String email) {	
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.email = email;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public char getSexo() {
		return sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
