package Ejercicios_de_Java;

import java.util.Scanner;

/* Hacer programa que solicite la cantidad de piezas de pan que un cliente compro
 * y el total que pagara. Cada pieza de pan cuesta $5. Si el cliente compra mas de 50 piezas, le 
 * costara $4.50 c/u. Si el cliente compra mas de 100 piezas, le costara $4.0 c/u.
 * 
 */
public class CantidadYTotalDeCompra {
    public static void main(String[] args) {
        
        int cantPiezas = 0;
        double totalPago = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Ingrese la cantidad de piezas que desea comprar: ");
            cantPiezas = scanner.nextInt();

            if (cantPiezas >= 50 && cantPiezas < 100) {
                
                totalPago = cantPiezas * 4.5;
            } else if (cantPiezas >= 100) {
                
                totalPago = cantPiezas * 4;
            } else {

                totalPago = cantPiezas * 5;
            }

            System.out.println("\nEl cliente compro " + cantPiezas + " piezas de pan.");
            System.out.println("\nEl total a pagar es: $" + totalPago);
        }
    }
}
