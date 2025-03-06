package UD05FlujoDatos.tareas;

import javax.swing.JOptionPane;

public class T5Ej12App {

	public static void main(String[] args) {
		
		//Declaración de variables
		String pass = "12345", passUsuario = "", mensaje = "";
		int intentos = 0;
		
		//Bucle de intentos
		while(intentos<3) {
			
			passUsuario=JOptionPane.
					 showInputDialog("Introduce el pass: ");
			if (pass.equals(passUsuario)) {
				mensaje = "Enhorabuena, login correcto";
				break;
			} else {
				JOptionPane.showMessageDialog(null, "No es una contraseña correcta, "
												+ "vuelve a probar");
//				System.out.println("No es una contraseña correcta, vuelve a probar");
				intentos++;
			}
			if(intentos == 3) {
				mensaje = "Agotados el número de intentos";
			}
			
		}
		
//		System.out.println(mensaje);
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
