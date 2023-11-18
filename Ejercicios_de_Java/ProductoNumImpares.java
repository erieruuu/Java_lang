package Ejercicios_de_Java;

import java.util.Scanner;

// Hacer programa que calcule el producto de los 10 primeros numeros impares.
public class ProductoNumImpares {
    public static void main(String[] args) {

        long productoImpares = 1;

        try (Scanner scanner = new Scanner(System.in)) {

            for (int i = 1; i < 20; i += 2) {

                productoImpares *= i;
            }
            
            System.out.println("El producto de los 10 primeros numeros impares es: " + productoImpares);
        }
    }
}
