package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su presupuesto quincenal: ");
        double quincena = Double.parseDouble(scanner.nextLine());
        System.out.println("Su presupuesto es de: $" + quincena);

        System.out.println("Introduzca el número de elementos a restar de su quincena: ");
        int veces = Integer.parseInt(scanner.nextLine());

        double gasto;
        double residuo = quincena;

        for(int i = 0; i < veces; i++) {
            System.out.println("Introduzca su gasto no. " + (i + 1) +": ");
            gasto = Double.parseDouble(scanner.nextLine());
            residuo = residuo - gasto;
        }

        if(residuo >= 0)
            System.out.println("Lo que queda de su quincena es: $" + (residuo));
        else
            System.out.println("Le quedas debiendo: $" + -residuo + " al señor de la tienda.");

    }
}
