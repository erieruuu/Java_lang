package Ejercicios_de_Java;

import java.util.Scanner;

/* Crear un programa de gestion de facturas para una empresa dedicada a la venta de azucar por kilos.
 * En cada factura se ingresara el codigo del producto y ademas la cantidad de kilos vendida junto con 
 * el total a pagar por kilos. De 5 facturas introducidas se pide: facturacion total, cantidad de kilos 
 * vendidos, cuantas facturas fueron emitidas por mas de $1000.
 */

public class Gestion_de_Facturas {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            
            String codigo = " ";
            int contador = 0, kilos = 0, totalKilos = 0;
            float precio = 0, importeFactura = 0, facturacionTotal = 0;

            for (int i = 1; i <= 5; i++) {

                System.out.println("\nFactura n° " + i);
                
                System.out.println("Codigo del producto: ");
                codigo = scanner.next();
                
                System.out.println("Cantidad en kilos: ");
                kilos = scanner.nextInt();
                
                System.out.println("Precio: ");
                precio = scanner.nextFloat();

                importeFactura = kilos * precio;
                facturacionTotal += importeFactura;

                if (importeFactura >= 1000) {
                    
                    contador++;
                }

                totalKilos += kilos;
            }

            System.out.println("\nDetalles de la venta:");
            System.out.println("\nFacturacion total: $" + facturacionTotal);
            System.out.println("Total de kilos vendidos: " + totalKilos);
        }
    }
}