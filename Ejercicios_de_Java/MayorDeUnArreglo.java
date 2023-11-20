package Ejercicios_de_Java;

import java.util.Scanner;

// Calcular el mayor de un arreglo.
public class MayorDeUnArreglo {
    public static void main(String[] args) {
        
        int array[] = new int[5];
        int mayor = array[0];

        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Ingrese los 5 números: ");
            
            for (int i = 0; i < array.length; i++) {

                array[i] = scanner.nextInt();

                if (array[i] > mayor) {
                    
                    mayor = array[i];
                }
            }
            
            System.out.println("El numero mayor es: " + mayor);
        }
    }
}
