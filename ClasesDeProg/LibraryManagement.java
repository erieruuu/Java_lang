package ClasesDeProg;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<>();
        ArrayList<String> books = new ArrayList<>();
        ArrayList<String> notifications = new ArrayList<>();
        int[] bookQuantities = new int[100]; // Assuming a maximum of 100 books
        double[] multas = new double[100]; // Assuming a maximum of 100 users

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu de Gestion de Biblioteca:");
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Añadir Libro");
            System.out.println("3. Prestar Libro");
            System.out.println("4. Devolver Libro");
            System.out.println("5. Mostrar Notificaciones");
            System.out.println("6. Salir");
            System.out.print("Elija una opcion: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Register User
                    System.out.print("Introducir nombre de usuario: ");
                    String userName = scanner.next();
                    users.add(userName);
                    multas[users.size() - 1] = 0; // Initialize the user's fine balance to 0
                    System.out.println("Usuario registrado exitosamente.");
                    break;
                case 2:
                    // Add Book to Catalog
                    System.out.print("Introducir titulo del libro: ");
                    String bookTitle = scanner.next();
                    System.out.print("Introducir autor del libro: ");
                    String bookAuthor = scanner.next();
                    System.out.print("Introducir cantidad de libros: ");
                    int bookQuantity = scanner.nextInt();
                    books.add(bookTitle + " por " + bookAuthor);
                    bookQuantities[books.size() - 1] = bookQuantity;
                    System.out.println("Libro añadido al catalogo.");
                    break;
                case 3:
                    // Lend Book
                    System.out.print("Introducir nombre de usuario: ");
                    String lendingUserName = scanner.next();
                    System.out.print("Introducir titulo del libro: ");
                    String lendingBookTitle = scanner.next();
                    int userIndex = users.indexOf(lendingUserName);
                    int bookIndex = books.indexOf(lendingBookTitle);
                    
                    if (userIndex != -1 && bookIndex != -1 && bookQuantities[bookIndex] > 0) {
                        bookQuantities[bookIndex]--;
                        System.out.println("Prestamo de libro realizado.");
                    } else {
                        System.out.println("Prestamo no realizado. Usuario o libro no encontrado/disponible.");
                    }
                    break;
                case 4:
                    // Return Book
                    System.out.print("Introducir nombre de usuario: ");
                    String returningUserName = scanner.next();
                    System.out.print("Introducir titulo del libro: ");
                    String returningBookTitle = scanner.next();
                    userIndex = users.indexOf(returningUserName);
                    bookIndex = books.indexOf(returningBookTitle);
                    
                    if (userIndex != -1 && bookIndex != -1) {
                        bookQuantities[bookIndex]++;
                        // Implement fine calculation and notification here
                        System.out.println("Devolucion de libro realizada.");
                    } else {
                        System.out.println("Devolucion no realizada. Usuario o libro no encontrado.");
                    }
                    break;
                case 5:
                    // Show Notifications
                    System.out.print("Introducir nombre de usuario: ");
                    String notificationUserName = scanner.next();
                    userIndex = users.indexOf(notificationUserName);
                    if (userIndex != -1) {
                        System.out.println("Notificaciones para " + notificationUserName + ":");
                        for (String notification : notifications) {
                            System.out.println(notification);
                        }
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, escoja una opcion valida.");
                    break;
            }
        } while (option != 6);

        scanner.close();
    }
}