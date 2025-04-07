package UD08POO;

public class ExempleEnum {
    public static void main(String[] args) {
        Dia avui = Dia.DIMECRES;

        if (avui == Dia.DISSABTE || avui == Dia.DIUMENGE) {
            System.out.println("És cap de setmana!");
        } else {
            System.out.println("És un dia laborable.");
        }
    }
}

enum Dia {
	DILLUNS, DIMARTS, DIMECRES, DIJOUS, DIVENDRES, DISSABTE, DIUMENGE;
}
