package UD07ArrayListHastable;

import java.util.ArrayList;
import java.util.Iterator;

public class UD07ArrayListApp {

	public static void main(String[] args) {
		// Declaración de variables
		ArrayList<String> lista = new ArrayList<>(); // {}
		ArrayList<Integer> listaNumeros = new ArrayList<>();// {}
		ArrayList<String> frutas = new ArrayList<>();// {}

		// Acciones del programa para lista

		lista.add("Elemento 1");// {"Elemento 1"}
		lista.add("Elemento 2");// {"Elemento 1","Elemento 2"}
		lista.add("Elemento 3");// {"Elemento 1","Elemento 2","Elemento 3"}
		lista.add("Elemento 4");// {"Elemento 1","Elemento 2","Elemento 3","Elemento 4"}
		lista.add("Elemento 5");
		// {"Elemento 1","Elemento 2","Elemento 3","Elemento 4","Elemento 5"}
//		System.out.println("Valores obtenidos del for:");
//		for (Object list : lista) {
//			System.out.println(list);
//		}
		
//		System.out.println("Valores obtenidos del toScring():");
//		System.out.println(lista.toString());
//		System.out.println("Tamaño del arrayList:");
//		System.out.println(lista.size());
//		lista.add("Otro texto");
//		System.out.println("Tamaño del arrayList después:");
//		System.out.println(lista.size());

//		// Acciones del programa para listaNumeros
//		listaNumeros.add(1); // {1}
//		listaNumeros.add(5); // {1,5}
//		listaNumeros.add(3); // {1,5,3}
//		listaNumeros.add(4); // {1,5,3,4}
////
//		System.out.println("______\nAñadir add(valor)");
//		System.out.println("toString():" + listaNumeros.toString()); //[1, 5, 3, 4]
//		System.out.println("size(): " + listaNumeros.size());
////
//		System.out.println("______\nEliminar remove(índice):");
//		listaNumeros.remove(2); // Quitame el valor del índice 2, 
//									//parámetro del remove es índice
//		System.out.println(listaNumeros.toString()); //[1, 5, 4]
////
//		System.out.println("______\nTamaño size():");
//		System.out.println(listaNumeros.size());
//
//		System.out.println("______\nObtener valor get(índice):");
//		System.out.println(listaNumeros.get(0)); // Indícame el valor del ÍNDICE 0
//		// listaNumeros[0] esta forma seria con array normales
//
//		System.out.println("______\nIterador/Repeticiones en bucle iterator():");
//		Iterator<Integer> iterador = listaNumeros.iterator();
//		int num;
//		while (iterador.hasNext()) {
//			num = iterador.next();
//			System.out.println(num);
//		}
//
//		System.out.println("______\nValor en un índice concreto indexOf(4):");
//		System.out.println(listaNumeros.indexOf(4)); // Parámentro es un VALOR
//		//lista = {"Elemento 1","Elemento 2","Elemento 3","Elemento 4","Elemento 5"}
//		System.out.println("______\nValor en un índice concreto de "
//							+ "lista de Strings indexOf('Elemento 4'):");
//		System.out.println(lista.indexOf("Elemento 4")); // Parámentro es un VALOR
//		//indexOf() si no encuentra el valor return -1
//
//		System.out.println("______\nEl size() de los elementos listaNumeros");
//		System.out.println(listaNumeros.size());
//		System.out.println("______\nElimina todos los elementos clear()");
//		listaNumeros.clear();
//		// listaNumeros = {}
//		System.out.println(listaNumeros.size());

//		// Acciones del programa para frutas
//
//		// Ejemplo borrar de una lista de frutas
//
		frutas.add("Manzanas");
		frutas.add("Limones");
		frutas.add("Peras");
		frutas.add("Naranjas");
		System.out.println("\nElementos de listas de frutas:");
		System.out.println(frutas.toString());
		int indexFruta = frutas.indexOf("Peras"); // 2
		// Eliminar la fruta "Peras" que esta en el índice 2
		// Equivalente:  frutas.remove(frutas.indexOf("Peras"));
		frutas.remove(indexFruta);
		System.out.println("Eliminada Peras de la lista de frutas");
		System.out.println(frutas.toString());

		indexFruta = frutas.indexOf("Limones"); // 1

		frutas.remove(indexFruta);
		System.out.println("Eliminada Limones de la lista de frutas");
		System.out.println(frutas.toString());
		frutas.add("Platanos");
		System.out.println(frutas.toString());
		indexFruta = frutas.indexOf("Naranjas");
		frutas.remove(indexFruta);
		System.out.println(frutas.toString());

	}

}
