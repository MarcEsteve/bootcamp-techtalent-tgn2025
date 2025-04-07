package UD08POO.tareas;

public class Password {
	
	// Atributos
	private int longitud;
	private String password;
	
	// Constructores
	public Password() {
		this.longitud = 8;
		this.password = "";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.password = generarPassword(longitud);
	}

	
	// Métodos
	private String generarPassword(int lentgh) {
		// Genera una contraseña aleatoria de longitud especificada
		String caracteres = 
				"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
		//Random de contraseñas con longitud especificada y caracteres aleatorios
		StringBuilder password = new StringBuilder();
		for (int i = 0; i < lentgh; i++) {
			int index = (int) (Math.random() * caracteres.length());
			password.append(caracteres.charAt(index));
		}
		return password.toString();
	}

	//Getters y Setters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
