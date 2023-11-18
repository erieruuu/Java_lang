package EquipoFutbol;

import Seleccion.Entrenador;
import Seleccion.Futbolista;
import Seleccion.Tecnico;
import Seleccion.Seleccion_de_Futbol;

import java.util.ArrayList;

public class EquipoFutbol {
    
    public static ArrayList <Seleccion_de_Futbol> integrantes = new ArrayList<Seleccion_de_Futbol>();
    
    public static void main(String[] args) {
        
        Entrenador entrenador1 = new Entrenador(1, "AE606060", "Antonio", "Diaz", 60);
        Futbolista futbolista1 = new Futbolista(2, "Juan", "Perez", 20, 20, "DC");
        Futbolista futbolista2 = new Futbolista(3, "Pedro", "Martinez", 22, 22, "DI");
        Tecnico tecnico1 = new Tecnico(4, "Miguel", "Rodriguez", 35, "Entrenamiento deportivo", 5);

        integrantes.add(entrenador1);
        integrantes.add(futbolista1);
        integrantes.add(tecnico1);

        //Concentracion
        
        System.out.println("Todos los integrantes de la seleccion comienzan una concentracion:");
        
        for (Seleccion_de_Futbol integrante : integrantes) {
            
            System.out.println(integrante.getName() + " " + integrante.getLastName() + " ");
            integrante.concentration();
        }

        //Viajar

        System.out.println("Todos los integrantes de la seleccion comienzan a viajar:\n");

        for (Seleccion_de_Futbol integrante : integrantes) {
            
            System.out.println(integrante.getName() + " " + integrante.getLastName());
            integrante.travel();
        }

        //Entrenamiento por el entrenador
        System.out.println("El entrenamiento comienza: Solamente el entrenador y el futbolista tienen metodos para entrenar.\n");
        System.out.println(entrenador1.getName() + " " + entrenador1.getLastName());
        entrenador1.goTraining();

        System.out.println(futbolista1.getName() + " " + futbolista1.getLastName());
        futbolista1.training();

        System.out.println(futbolista2.getName() + " " + futbolista2.getLastName());
        futbolista2.training();
    }
}
