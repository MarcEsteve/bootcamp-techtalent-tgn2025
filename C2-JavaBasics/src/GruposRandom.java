
import java.util.ArrayList;
import java.util.Collections;

public class GruposRandom {

    public static void main(String[] args) {
        // Lista de alumnos con nombres específicos
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Enya");
        alumnos.add("Ivette");
        alumnos.add("David");
        alumnos.add("Ani");
        alumnos.add("Alba");
        alumnos.add("Daniel");
        alumnos.add("Adrià");
        alumnos.add("Adri");
        alumnos.add("Hassan");
        alumnos.add("Marc");
        alumnos.add("Israel");
        alumnos.add("Paula");
        alumnos.add("Dani");
        alumnos.add("Ilyas");
        alumnos.add("Schneider");

        // Mezclar la lista de alumnos
        Collections.shuffle(alumnos);

        // Crear grupos de 3 alumnos cada uno
        ArrayList<ArrayList<String>> grupos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ArrayList<String> grupo = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                grupo.add(alumnos.get(i * 3 + j));
            }
            grupos.add(grupo);
        }

        // Imprimir los grupos
        for (int i = 0; i < grupos.size(); i++) {
            System.out.println("Grupo " + (i + 1) + ": " + grupos.get(i));
        }
    }
}