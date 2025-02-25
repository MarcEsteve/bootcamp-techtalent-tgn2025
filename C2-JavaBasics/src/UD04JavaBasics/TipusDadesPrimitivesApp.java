package UD04JavaBasics;

import java.util.Scanner;

public class TipusDadesPrimitivesApp {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        // Executem cada exemple
        exempleByte();
        exempleShort();
        exempleInt();
        exempleLong();
        exempleFloat();
        exempleDouble();
        exempleBoolean();
        exempleChar();

//        scanner.close();
    }

    public static void exempleByte() {
        System.out.println("\n📌 Exemple de BYTE:");
        byte edat = 25;
        System.out.println("L'edat d'un usuari pot ser: " + edat);
    }

    public static void exempleShort() {
        System.out.println("\n📌 Exemple de SHORT:");
        short anyNaixement = 1995;
        System.out.println("L'any de naixement pot ser: " + anyNaixement);
    }

    public static void exempleInt() {
        System.out.println("\n📌 Exemple de INT:");
        int saldo = 500000;
        System.out.println("El saldo d'un compte bancari pot ser: " + saldo);
    }

    public static void exempleLong() {
        System.out.println("\n📌 Exemple de LONG:");
        long transaccions = 345678912345L;
        System.out.println("Número total de transaccions: " + transaccions);
        long tempsActual = System.currentTimeMillis();
        System.out.println("Temps actual en mil·lisegons: " + tempsActual);
    }

    public static void exempleFloat() {
        System.out.println("\n📌 Exemple de FLOAT:");
        float temperatura = 23.5f;
        System.out.println("La temperatura actual és: " + temperatura + "°C");
    }

    public static void exempleDouble() {
        System.out.println("\n📌 Exemple de DOUBLE:");
        double preuProducte = 199.99;
        System.out.println("El preu del producte és: " + preuProducte + "€");
    }

    public static void exempleBoolean() {
        System.out.println("\n📌 Exemple de BOOLEAN:");
        boolean esAdmin = true;
        System.out.println("L'usuari és administrador? " + esAdmin);
    }

    public static void exempleChar() {
        System.out.println("\n📌 Exemple de CHAR:");
        char inicialNom = 'A';
        System.out.println("La inicial del nom és: " + inicialNom);
    }
}
