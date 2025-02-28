package UD05FlujoDatos.tareas;

import javax.swing.JOptionPane;

public class T5Ej04AreaCirculoApp {

	public static void main(String[] args) {

		double radio = 5.0;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
        
        String r = "";
        r = JOptionPane.showInputDialog("Introduce el radio: ");
        double routput= Integer.parseInt(r);
        double rarea = Math.PI * Math.pow(routput, 2);
        JOptionPane.showMessageDialog(null, "El área del círculo con radio " 
        			+ routput + " es: " + rarea);
	}

}
