package Ejercicios_de_Java;

import java.util.Scanner;

/* Hacer un programa que nos solicite 10 numeros enteros que luego muestre el promedio de los que sean
 * negativos y a su vez de los positivos. Tambien nos dirá cuantos 0 fueron introducidos.
 */
public class DiezNumEnteros {
    public static void main(String[] args) {

        int num = 0, cantNeg = 0, cantPos = 0, sumaNeg = 0, sumaPos = 0, cantCeros = 0;
        double promNeg = 0, promPos = 0;
        int k = 0;
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            while (k < 10) {
                
                System.out.println("Introduce un numero (Positivo o negativo): ");
                num = scanner.nextInt();

                if (num == 0) {
                    
                    cantCeros++;
                } else if (num > 0) {
                    
                    cantPos++;
                    sumaPos += num;
                } else {
                    cantNeg++;
                    sumaNeg += num;
                }
                k++;
            }

            if (cantPos == 0) {
                
                System.out.println("No se puede realizar el promedio de los positivos.");
            } else {
                
                promPos = sumaPos / cantPos;
                System.out.println("El promedio de los positivos es: " + promPos);
            }

            if (cantNeg == 0) {
                
                System.out.println("No se puede realizar el promedio de los negativos.");
            } else {
                
                promNeg = sumaNeg / cantNeg;
                System.out.println("El promedio de los negativos es: " + promNeg);
            }

            System.out.println("\nLa cantidad de ceros son: " + cantCeros);
        }
    }
}
