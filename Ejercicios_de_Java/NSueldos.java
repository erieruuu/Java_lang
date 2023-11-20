package Ejercicios_de_Java;

import javax.swing.JOptionPane;

/* Hacer programa que solicite elegir n cantidad de sueldos. Al final mostrara en pantalla cual es mayor. Con JOption Pane. */
public class NSueldos {
    public static void main(String[] args) {

        int cantidadSueldos = 0, sueldo = 0, sueldoMaximo = 0;
        boolean primerSueldo = false;

        cantidadSueldos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos sueldos solicitara?"));

        for (int i = 1; i <= cantidadSueldos; i++) {

            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el sueldo " + (i)));

            if (primerSueldo == false) {
                
                sueldoMaximo = sueldo;
                primerSueldo = true;
            }

            if (sueldo > sueldoMaximo) {
                
                sueldoMaximo = sueldo;
            }
        }
        
        JOptionPane.showMessageDialog(null, "El sueldo mayor es: " + sueldoMaximo);
    }
}
