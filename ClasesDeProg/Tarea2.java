package ClasesDeProg;
/* 
Calcular el promedio de unas notas, en el cual deben solicitar al usuario que 
ingrese la cantidad de notas que se va a promediar y luego ingresar cada una de esas notas. 
Hacerlo con cada estructura repetitiva (While, For, Do-While).
*/

/*
Ejemplo de "For" dado en clases:

public class Tarea2 {
    
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {

            int cantidad;

            System.out.println("Ingrese la cantidad de notas:");
            cantidad = scanner.nextInt();

            int[] notas = new int[cantidad];

            double promedio = 0.0;

            for (int i = 0; i < cantidad; i++) {
                
                System.out.println("Ingrese la nota " + 1 + ":");
                notas[i] = scanner.nextInt();
                promedio += notas[i];
            }
            if (cantidad > 0) {
                promedio /= cantidad;
                System.out.println("El promedio de las notas es: " + promedio);
            }   
        }
    }
}
*/

import java.util.Scanner;

//Estuctura While

public class Tarea2 {
    
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Ingrese la cantidad de notas a promediar: ");
            int cantidadNotas = scanner.nextInt();

            double suma = 0;
            int contador = 0;

            while (contador < cantidadNotas) {
                System.out.print("Ingrese la nota " + (contador + 1) + ": ");
                double nota = scanner.nextDouble();
                suma += nota;
                contador++;
            }

            double promedio = suma / cantidadNotas;
            System.out.println("El promedio de las notas es: " + promedio);
        }
    }
}


//Estructura For
/* 
public class Tarea2 {
    
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Ingrese la cantidad de notas a promediar: ");
            int cantidadNotas = scanner.nextInt();

            double suma = 0;

            for (int i = 1; i <= cantidadNotas; i++) {
                System.out.print("Ingrese la nota " + i + ": ");
                double nota = scanner.nextDouble();
                suma += nota;
            }

            double promedio = suma / cantidadNotas;
            System.out.println("El promedio de las notas es: " + promedio);
        }
    }
}
*/

// Estructura Do-While
/*
public class PromedioNotasDoWhile {
    
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de notas a promediar: ");
            int cantidadNotas = scanner.nextInt();

            double suma = 0;
            int contador = 0;

            do {
                System.out.print("Ingrese la nota " + (contador + 1) + ": ");
                double nota = scanner.nextDouble();
                suma += nota;
                contador++;
            } while (contador < cantidadNotas);

            double promedio = suma / cantidadNotas;
            System.out.println("El promedio de las notas es: " + promedio);
        }
    }
}
*/