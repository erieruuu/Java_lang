package Ejercicios_de_Java;

import java.util.Scanner;

/* Crear programa que solicite introducir 6 calificaciones, que al final diga cuantos alumnos
 * aprobaron, cuantos tuvieron "excelencia" y cuantos reprobaron.
 */
public class SeisCalificaciones {
    public static void main(String[] args) {

        int aprobados = 0, reprobados = 0, excelentes = 0;
        float calif = 0;
        int i = 1;
        
        try (Scanner scanner = new Scanner(System.in)) {

            while (i <= 6) {
                
                System.out.println("Introduzca calificaciones de 0 a 100: ");
                calif = scanner.nextFloat();
                
                if (calif >= 91 && calif <= 100) {
                    
                    excelentes++;
                } else if (calif >= 71) {
                    
                    aprobados++;
                } else {
                    
                    reprobados++;
                }
                
                i++;
            }

            System.out.println("Cantidad de alumnos excelentes: " + excelentes);
            System.out.println("Cantidad de alumnos aprobados: " + aprobados);
            System.out.println("Cantidad de alumnos reprobados: " + reprobados);
        }
    }
}
