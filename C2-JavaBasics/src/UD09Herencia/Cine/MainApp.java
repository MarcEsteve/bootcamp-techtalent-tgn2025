package UD09Herencia.Cine;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Peliculas pelicula1 = new Peliculas("Dune", 166, 13, "Director");
		Cine cine1 = new Cine(pelicula1, 8, 8, 9);

		int capacidad = cine1.getColumnas() * cine1.getFilas();
		Butaca[][] asientos = new Butaca[cine1.getFilas()][cine1.getColumnas()];

		rellenarAsientos(asientos);
		imprimirCine(asientos);

		System.out.println("¿Cuantos espectadores van al cine?");
		int nEspectadores = sc.nextInt();
		Espectador[] espectadores = new Espectador[nEspectadores];

		generarEspectadores(nEspectadores, espectadores);
		sentarEspectadores(espectadores, capacidad, cine1, asientos, pelicula1);
		imprimirCine(asientos);

		sc.close();
	}

	public static void sentarEspectadores(Espectador[] espectadores, int capacidad, Cine sala, Butaca[][] asientos,
			Peliculas peli) {
		int contador = 0;
		while (contador < espectadores.length && hayEspacio(asientos)) {
			int fila = generarAsiento(sala.getFilas());
			int columna = generarAsiento(sala.getColumnas());
			while (asientos[fila][columna].isOcupado()) {
				fila = generarAsiento(sala.getFilas());
				columna = generarAsiento(sala.getColumnas());
			}
			if (puedeSentarse(espectadores[contador], sala, peli, asientos)) {
				asientos[fila][columna].ocuparAsiento();
			} else {
				System.out.println(espectadores[contador].getNombre() + " No puede ver la película.\n");
			}
			contador++;
		}
	}

	public static int generarAsiento(int n) {
		return (int) (Math.random() * n);
	}

	public static void generarEspectadores(int n, Espectador[] espectadores) {
		for (int i = 0; i < n; i++) {
			espectadores[i] = new Espectador();
		}
	}

	public static void imprimirCine(Butaca[][] asientos) {
		for (int i = asientos.length - 1; i >= 0; i--) {
			for (int j = 0; j < asientos[i].length; j++) {
				Butaca asientoActual = asientos[i][j];
				System.out.print(Integer.toString(asientoActual.getfila()) + asientoActual.getcolumna() + "(");
				if (asientoActual.isOcupado()) {
					System.out.print("X) ");
				} else {
					System.out.print("o) ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void rellenarAsientos(Butaca[][] asientos) {
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[i].length; j++) {
				asientos[i][j] = new Butaca();
				asientos[i][j].setfila(i + 1);
				;
				asientos[i][j].setcolumna((char) (65 + j));
			}
		}
	}

	public static boolean puedeSentarse(Espectador persona, Cine sala, Peliculas peli, Butaca[][] a) {

		if (tieneDinero(persona, sala) == false) {
			System.out.println(persona.getNombre() + " ---Le falta dinero---");
//			sinDinero++;
		} else if (tieneEdad(peli, persona) == false) {
			System.out.println(persona.getNombre() + " ---No tiene la edad minima---");
//			sinEdad++;
		} else if (tieneDinero(persona, sala) == false && tieneEdad(peli, persona) == false) {
			System.out.println(persona.getNombre() + " no tiene suficiente dinero ni edad.");
//			sinAmbas++;

		}
		return ((tieneDinero(persona, sala)) && (tieneEdad(peli, persona)));
	}

	public static boolean tieneDinero(Espectador persona, Cine sala) {
		return (persona.getDinero() >= sala.getPrecio());
	}

	public static boolean hayEspacio(Butaca[][] asientos) {
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[i].length; j++) {
				if (!asientos[i][j].isOcupado()) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean tieneEdad(Peliculas peli, Espectador persona) {
		return (persona.getEdad() >= peli.getEdadMinima());
	}

}
