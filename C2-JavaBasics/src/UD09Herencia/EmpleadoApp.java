package UD09Herencia;

public class EmpleadoApp {

	public static void main(String[] args) {
		//Creamos instanciaciones de Comercial y Repartidor
		Comercial comercial1 = new Comercial("Juan", "Pérez", 30, 2000, 10);
		Repartidor repartidor1 = new Repartidor("Ana", "García", 45, 1500, "Zona Norte");
		
		//Invocamos los métodos plus de cada clase
		comercial1.plus(300);
		repartidor1.plus(300);
		
		// Mostramos los atributos, usando los métodos getters de la clase padre
		System.out.println("Comercial: " + comercial1.getNombre() + ", Salario: " + comercial1.getSalario());
		System.out.println("Repartidor: " + repartidor1.getNombre() + ", Salario: " + repartidor1.getSalario());
		
		

	}

}
