package UD08POO;

public class EmpleadoApp {

	public static void main(String[] args) {
		
		//Instanciaciones de Empleado()
		
		Empleado empleado1 = new Empleado();
		
		//Equivalente a tener "empleado1= {nombre: "", apellido: "",... el constructor por defecto lo define
		
		Empleado empleado2 = new Empleado();
//	
		System.out.println("El nombre del empleado es: " + empleado1.getNombre());
		empleado1.setNombre("Marc");
		System.out.println("El nombre del empleado es: " + empleado1.getNombre());
		empleado2.setNombre("Pedro");

		
//		System.out.println(empleado1.nombre);

		if (empleado1.equals(empleado2)) {
			System.out.println("Los objetos empleado1 y empleado2 son iguales");
		} else {
			System.out.println("Los objetos empleado1 y empleado2 no son iguales");
		}

		Empleado empleado3;
		empleado3 = empleado1;

		if (empleado3.equals(empleado1)) {
			System.out.println("Los objetos empleado3 y empleado1 son iguales");
		} else {
			System.out.println("Los objetos empleado3 y empleado1 no son iguales");
		}
		
		//Ejemplo con arrays
		
		Empleado arrayObjetos[] = new Empleado[3];

		arrayObjetos[0] = new Empleado("Fernando", "Esteve", 23, 1000);
		arrayObjetos[1] = new Empleado("Epi", "Dermis", 30, 1500);
		arrayObjetos[2] = new Empleado("Sonia", "Fermia", 25, 1200);
		
//		Bloque de sumar salarios de todos los empleados del array
		int suma = 0;
		for (int i = 0; i < arrayObjetos.length; i++) {
			suma += arrayObjetos[i].getSalario();
		}
		System.out.println("La suma de salarios es " + suma);
		
//		Todo el bloque de equivalente a un método :
//		sumaTodoSalarios(Empleado aObj[]) i el return seria sumaTotal en double
	}

}
