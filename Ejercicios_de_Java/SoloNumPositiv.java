package Ejercicios_de_Java;

import java.util.Scanner;

// Programa que solo permita introducir numeros positivos y que luego calcule el promedio de todos.
public class SoloNumPositiv {
    public static void main(String[] args) {

        int num = 0, suma = 0, cantidadNum = 0;
        double media = 0; 

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Introduce un numero positivo:");
            num = scanner.nextInt();

            while (num > 0) {

                suma += num;
                cantidadNum++;
                System.out.println("Introduce otro numero:");
                num = scanner.nextInt();
            }
            
            if (cantidadNum == 0) {
                System.out.println("No se puede dividir entre 0.");
            } else {
                media = suma / cantidadNum;
                System.out.println("El total de la suma es: " + suma);
                System.out.println("La media es: " + media);
            }
        }
    }
    
}
