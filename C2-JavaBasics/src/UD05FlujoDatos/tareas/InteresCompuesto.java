package UD05FlujoDatos.tareas;

public class InteresCompuesto {

	public static void main(String[] args) {
		double capitalInicial = 10000;
        double tasaInteres = 0.05; // 5% anual
        int años = 5;

        double capitalFinal = capitalInicial * Math.pow(Math.E, tasaInteres * años);
        System.out.println("El capital final después de " + años + " años es: " 
        				+ capitalFinal);
        
        // Este ejercicio muestra el interés compuesto

	}

}
