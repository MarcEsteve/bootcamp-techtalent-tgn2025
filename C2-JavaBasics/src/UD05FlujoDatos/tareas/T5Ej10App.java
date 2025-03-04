package UD05FlujoDatos.tareas;

import javax.swing.JOptionPane;

public class T5Ej10App {

	public static void main(String[] args) {
		// Realiza una aplicación que nos pida un número de ventas a introducir
		//, después nos pedirá tantas ventas por teclado como número de ventas 
		// se hayan indicado. Al final mostrara la suma de todas las ventas. 
		// Piensa que es lo que se repite y lo que no.
		
		//Primera etapa necesito un INPUT de usuario el el número de ventas
		//Significa cuantas veces te pide el precio
		
		String cuantasVentas = "";
		cuantasVentas = JOptionPane.showInputDialog("Introduce las ventas: ");
        int ventas= Integer.parseInt(cuantasVentas);
       	int valor = 0;
        
        //Segunda etapa, entro en un bucle de pedir el total de cada venta
        //Significa el total que queremos sumar
        
        for (int i = 1; i <= ventas; i++) {
        	String totalVenta = "";
        	totalVenta = JOptionPane.showInputDialog("Introduce el valor "
        			+ "		total de la venta " + i);
            valor+= Integer.parseInt(totalVenta);
		}
        
        //Tercera etapa mostrar los datos finales, o total de ventas
        JOptionPane.showMessageDialog(null, "El valor de ventas totales es " 
        								+ valor);
//        System.out.println("El valor de ventas totales es " + valor);

	}

}
