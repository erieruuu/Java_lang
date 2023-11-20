package ClasesDeProg;
/*
package com.mycompany.Proyecto2;

import java.util.Scanner;
public class Proyecto2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user = "lesqueda", password = "12345";
        String key1, key2;

        System.out.println("Ingrese su usuario: ");
        key1 = scan.nextLine();

        System.out.println("Ingrese su contraseña: ");
        key2 = scan.nextLine();

        //access
        if ((key1 == user) && (key2 == password)) {
            System.out.println("Accedio al sistema.");
        } else {
            System.out.println("Usuario o contraseña incorrecta");
        }
    }
}
*/

import java.util.Scanner;

public class Proyecto2 {
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            
            int num1, num2, res = 0, op;

            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            op = scan.nextInt();

            System.out.println("Ingrese el numero 1: ");
            num1 = scan.nextInt();
            System.out.println("Ingrese el numero 2: ");
            num2 = scan.nextInt();

            switch (op) {
                case 1:
                
                res = num1 + num2;

                break;

                case 2:

                res = num1 - num2;

                break;

                case 3:

                res = num1 * num2;

                break;
            }
            
            System.out.println("El resultado es: " + res);
        }
    }
}
