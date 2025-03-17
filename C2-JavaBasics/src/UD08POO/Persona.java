package UD08POO;

public class Persona {
	// Atributos (o campos/propiedades)
	private String nombre;
	private int edad;
	private String ciudad;

	// Constructor(es)
	public Persona() {
		// Constructor por defecto
	}

	public Persona(String nombre, int edad, String ciudad) {
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
	}

	//Métodos Getters y setters > Eclipse >"Source">"Generate Getters and Setters" > 
//				"Escoges los atributos que quieres generar" > "Generate"
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
	

}
