package ClasesDeProg;
/* Hacer sistema de seleccion de clase y horarios al matricular, 
tiene que mostrar el nombre, cedula, materia y horario de estudiante */ 

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Curso {
    String nombre;
    String horario;

    Curso(String nombre, String horario) {
        this.nombre = nombre;
        this.horario = horario;
    }
}

public class Tarea1 {
    public static void main(String[] args) {

        List<Curso> cursosDisponibles = new ArrayList<>();

        // Agregar cursos con horarios
        cursosDisponibles.add(new Curso("Calculo Diferencial I", "Jueves - 3:30pm a 5:45pm"));
        cursosDisponibles.add(new Curso("Electronica Digital", "Lunes - 5:45pm a 10:00pm"));
        cursosDisponibles.add(new Curso("Programacion II", "Sabados - 12:00pm a 4:30pm"));
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Solicitar al estudiante su nombre y cedula
            System.out.println("Ingrese su nombre: ");
            String nombreEstudiante = scanner.nextLine();
            System.out.println("Ingrese su cedula: ");
            String cedulaEstudiante = scanner.nextLine();

            // Mostrar la lista de cursos con horarios
            System.out.println("\nLista de cursos con sus horarios:");
            for (int i = 0; i < cursosDisponibles.size(); i++) {
                Curso curso = cursosDisponibles.get(i);
                System.out.println((i + 1) + ". " + curso.nombre + ": " + curso.horario);
            }

            // Seleccionar un curso
            System.out.println("\nSeleccione el curso al que desea incribirse: ");
            int cursoSeleccionado = scanner.nextInt();

            // Verificar si la seleccion es valida
            if (cursoSeleccionado >= 1 && cursoSeleccionado <= cursosDisponibles.size()) {
                Curso cursoElegido = cursosDisponibles.get(cursoSeleccionado - 1);
                System.out.println("Matricula exitosa para " + nombreEstudiante + " // " + cedulaEstudiante + ", en " + cursoElegido.nombre + ": " + cursoElegido.horario + ".");
            } else {
                System.out.println("Seleccion incorrecta. Por favor, elija un numero de curso valido.");
            }
        }
    }
}