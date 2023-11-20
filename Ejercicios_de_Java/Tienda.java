package Ejercicios_de_Java;

import java.util.Scanner;

// Hacer un arreglo con 30 Ventas del mes, y que diga cuales son mayores a $2000.
public class Tienda {
    public static void main(String[] args) {

        double ventas[] = new double[30];

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese las 30 ventas del mes: ");

            for (int i = 0; i < ventas.length; i++) {

                System.out.println("Venta " + (i + 1));
                ventas[i] = scanner.nextDouble();
            }

            int k = 0;
            int total = 0;

            System.out.println("Ventas mayores o igual a $2000");

            while (k < 30) {
                if (ventas[k]>= 2000) {
                    System.out.println("$" + ventas[k]);
                    total++;
                }
                
                k++;
            }

            System.out.println("\nEl total de ventas mayores a $2000 es: " + total);
        }
    }
}
