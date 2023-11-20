package Ejercicios_de_Java;

import java.util.Scanner;

// Crear un programa que solicite numeros y que al poner 0 deje solicitar para luego sumarlos.
public class ProgramaPeticionNumeros {
    public static void main(String[] args) {
        
        int num = 0, suma = 0;
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            do {

                System.out.println("Introduce un numero (presione 0 para sumar los numeros introducidos): ");
                num = scanner.nextInt();
                suma += num;
            } while (num != 0);

            System.out.println("La suma de todos los numeros es: " + suma);
        }
    }
}
