package ClasesDeProg;
import java.util.Scanner;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

class Usuario {
    String nombre;
    int id;
    ArrayList<String> notificaciones; // Una lista de notificaciones
    
    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.notificaciones = new ArrayList<>();
    }
    
    // Otros atributos y métodos de la clase Usuario (Si se me ocurren xD)
    // Mostrar notificaciones
    public void mostrarNotificaciones() {
        System.out.println("Notificaciones para " + nombre + ":");
        for (String notificacion : notificaciones) {
        System.out.println(notificacion);
        }
    }

    public Prestamo buscarPrestamoPorLibro(Libro libro) {
        return null;
    }

    public void eliminarPrestamo(Prestamo prestamo) {
    }

    public void aplicarMulta(double multa) {
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldoMultas() {
        return 0;
    }
}

class Libro {
    String titulo;
    String autor;
    int cantidadDisponible;
    int id;
    
    // Otras propiedades del libro
    public Libro(String titulo, String autor, int cantidadDisponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getId() {
        return id;
    }

    public void setDisponible(boolean b) {
    }

    public String getTitulo() {
        return titulo;
    }

    public void prestarLibro(Usuario usuarioPrestar) {
    }
}

class Prestamo {
    Usuario usuario;
    Libro libro;
    Date fechaPrestamo;
    Date fechaVencimiento;
    Date fechaDevolucion;
    double multa;
    boolean devuelto;
    
    public Prestamo(Usuario usuario, Libro libro, Date fechaPrestamo, Date fechaVencimiento) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaDevolucion = null;
        this.multa = 0.0;
        this.devuelto = false;
    }

    public Usuario getUsuario() {
        return null;
    }
    
    public Libro getLibro() {
        return libro;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }
}


public class Gestion_de_biblioteca { 
    //Listas en arreglos de cada clase
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    ArrayList<Libro> catalogo = new ArrayList<Libro>();
    ArrayList<Prestamo> historialPrestamos = new ArrayList<Prestamo>();
    
    private Prestamo[] prestamos;
    private static Usuario[] listaDeUsuarios;
    private static Libro[] catalogoLibros;

    public void mostrarMultasPendientes() {
        System.out.println("Usuarios con multas pendientes:");

        for (Usuario usuario : usuarios) {
            double saldoMultas = usuario.getSaldoMultas();

            if (saldoMultas > 0) {
                System.out.println("Nombre: " + usuario.getNombre());
                System.out.println("Monto de multas pendientes: " + saldoMultas);
            }
        }
    }

    public List<Prestamo> verHistorialPrestamosUsuarioEspecifico(Usuario usuario) {
        List<Prestamo> historialPrestamos = new ArrayList<>();
    
        // Recorre la lista de préstamos para encontrar los préstamos del usuario
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getUsuario() == usuario) {
                historialPrestamos.add(prestamo);
            }
        }
    
        return historialPrestamos;
    }

    public static Usuario encontrarUsuarioPorNombre(String nombre) {
        for (Usuario usuario : listaDeUsuarios) {
            if (usuario.nombre.equals(nombre)) {
                return usuario;
            }
        }
        return null; // Retorna null si no se encontró el usuario
    }

    // Método para buscar un libro por su ID
    public static Libro encontrarLibroPorID(int idLibro) {
        for (Libro libro : catalogoLibros) {
            if (libro.getId() == idLibro) {
                return libro;
            }
        }
        return null; // Retorna null si el libro no se encuentra
    }
    
    public void registrarUsuario(String nombre, int id) {
        Usuario usuario = new Usuario(nombre, id);
        usuarios.add(usuario);
        System.out.println("Usuario registrado con éxito: " + usuario.nombre);
    }
    
    public void agregarLibro(String titulo, String autor, int cantidad) {
        Libro libro = new Libro(titulo, autor, cantidad);
        catalogo.add(libro);
        System.out.println("Libro agregado al catálogo: " + libro.titulo);
    }

    public boolean devolverLibro(Usuario usuario, Libro libro) {
        // 1. Verificar si el usuario ha tomado prestado el libro
        Prestamo prestamo = usuario.buscarPrestamoPorLibro(libro);
    
        if (prestamo != null) {
            // 2. Calcular la fecha de devolución
            Date fechaDevolucion = new Date(); // Obtén la fecha actual
    
            // 3. Actualizar el estado del libro
            libro.setDisponible(true);
    
            // 4. Eliminar el préstamo de la lista de préstamos del usuario
            usuario.eliminarPrestamo(prestamo);
    
            // 5. Calcular y aplicar multas (si es necesario)
            double multa = calcularMulta(prestamo, fechaDevolucion);
            if (multa > 0) {
                usuario.aplicarMulta(multa);
            }
    
            // 6. Registrar la devolución
            registrarDevolucion(prestamo, fechaDevolucion);
        } else {
            System.out.println("Este libro no ha sido prestado por este usuario.");
        }
        return false;
    }
    
    
    private double calcularMulta(Prestamo prestamo, Date fechaDevolucion) {
        return 0;
    }

    private void registrarDevolucion(Prestamo prestamo, Date fechaDevolucion) {
    }

    public boolean prestarLibro(Usuario usuario, Libro libro) {
        
        // Implementar lógica para verificar si el libro está disponible y registrar el préstamo
        // Actualizar la cantidad de libros disponibles y agregar el préstamo al historial
        
        // Buscar el libro en el catálogo
        Libro libroEnCatalogo = null;
        for (Libro l : catalogo) {
            if (l.titulo.equals(libro.titulo) && l.autor.equals(libro.autor)) {
                libroEnCatalogo = l;
                break;
            }
        }

        if (libroEnCatalogo == null) {
            System.out.println("El libro no está disponible en el catálogo.");
            return false;
        }

        if (libroEnCatalogo.cantidadDisponible <= 0) {
            System.out.println("El libro no está disponible en este momento.");
            return false;
        }

        // Calcular la fecha de préstamo y la fecha de vencimiento (por ejemplo, 14 días después del préstamo)
        Date fechaPrestamo = new Date();
        Date fechaVencimiento = new Date(fechaPrestamo.getTime() + 14 * 24 * 60 * 60 * 1000); // Cambiar el dia (14)

        // Crear un nuevo préstamo
        Prestamo prestamo = new Prestamo(usuario, libroEnCatalogo, fechaPrestamo, fechaVencimiento);

        // Actualizar la cantidad de libros disponibles en el catálogo
        libroEnCatalogo.cantidadDisponible--;

        // Agregar el préstamo al historial
        historialPrestamos.add(prestamo);

        System.out.println("Préstamo registrado con éxito. Fecha de vencimiento: " + fechaVencimiento);
        return false;
    }

    public void devolverLibro(Prestamo prestamo) {
        
        // Verificar si el préstamo existe en el historial
        if (!historialPrestamos.contains(prestamo)) {
            System.out.println("Este préstamo no se encuentra en el historial.");
            return;
        }
    
        // Verificar si el libro ya ha sido devuelto
        if (prestamo.devuelto) {
            System.out.println("Este libro ya ha sido devuelto.");
            return;
        }
    
        // Calcular la fecha actual
        Date fechaDevolucion = new Date();
    
        // Calcular si la devolución es tardía y calcular la multa si es el caso
        long diasRetraso = (fechaDevolucion.getTime() - prestamo.fechaVencimiento.getTime()) / (24 * 60 * 60 * 1000); // Diferencia en días
        double multa = 0.0;
        if (diasRetraso > 0) {
            // Calcular la multa
            multa = diasRetraso * 5.0; // Por ejemplo, $5 por día de retraso
            
            // Agregar una notificación al usuario sobre la multa
            String notificacion = "Se ha aplicado una multa de $" + prestamo.multa + " por la devolución tardía del libro: " + prestamo.libro.titulo;
            prestamo.usuario.notificaciones.add(notificacion);
        }
    
        // Actualizar el préstamo y el historial
        prestamo.devuelto = true;
    
        // Actualizar la cantidad de libros disponibles en el catálogo
        prestamo.libro.cantidadDisponible++;
    
        // Mostrar un mensaje al usuario con la información de la devolución y, si corresponde, la multa
        System.out.println("Devolución registrada con éxito.");
        System.out.println("Fecha de devolución: " + fechaDevolucion);
        
        if (diasRetraso > 0) {
            System.out.println("Días de retraso: " + diasRetraso);
            System.out.println("Multa: $" + multa);
        }
    }
    
    // Dia uno y ya se me quiere explotar el cerebro jajajaj (Insertar meme: "Estoy cansado jefe... :[")

    
    // "Una eternidad mas tarde..." (Meme de Bob Esponja por si no la captan)
    // Ok sigamos B) (No recuerdo lo que estaba haciendo xD)

    public void verHistorialPrestamos(Usuario usuario) {
        
        // Mostrar el historial de prestamos del usuario
        System.out.println("Historial de préstamos para " + usuario.nombre + ":");
        
        boolean seEncontraronPrestamos = false;
        
        for (Prestamo prestamo : historialPrestamos) {
            if (prestamo.usuario == usuario) {
                seEncontraronPrestamos = true;
                System.out.println("Título del libro: " + prestamo.libro.titulo);
                System.out.println("Autor del libro: " + prestamo.libro.autor);
                System.out.println("Fecha de préstamo: " + prestamo.fechaPrestamo);
                System.out.println("Fecha de vencimiento: " + prestamo.fechaVencimiento);
                if (prestamo.devuelto) {
                    System.out.println("Fecha de devolución: " + prestamo.fechaDevolucion);
                    System.out.println("Multa: $" + prestamo.multa);
                }
                System.out.println("------------------------");
            }
        }
        
        if (!seEncontraronPrestamos) {
            System.out.println("No se encontraron préstamos para " + usuario.nombre);
        }
    }

    // Otras funciones para gestionar multas y notificaciones (Aviso que esto es solo para hacer el codigo mas... exquisito...)
    
    //Mostrar multas
    public void mostrarMultasPendientes(Usuario usuario) {
        System.out.println("Multas pendientes para " + usuario.nombre + ":");
        
        for (Prestamo prestamo : historialPrestamos) {
            if (prestamo.usuario == usuario && prestamo.multa > 0) {
                System.out.println("Título del libro: " + prestamo.libro.titulo);
                System.out.println("Multa: $" + prestamo.multa);
                System.out.println("------------------------");
            }
        }
    }

    public static void main(String[] args) {
        
        Gestion_de_biblioteca biblioteca = new Gestion_de_biblioteca();

        try (Scanner scanner = new Scanner(System.in)) {
        
            int opcion;

            do {
                System.out.println("Menú de Biblioteca:");
                System.out.println("1. Registrar Usuario");
                System.out.println("2. Agregar Libro al Catálogo");
                System.out.println("3. Prestar Libro");
                System.out.println("4. Devolver Libro");
                System.out.println("5. Ver Historial de Préstamos");
                System.out.println("6. Mostrar Multas Pendientes");
                System.out.println("7. Mostrar Notificaciones");
                System.out.println("8. Salir");
                System.out.print("Elije una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        // Llamar al método para registrar usuario
                        System.out.println("Ingrese el nombre del usuario: ");
                        String nombre = scanner.next();
                        System.out.println("Ingrese el ID del usuario: ");
                        int id = scanner.nextInt();
                        biblioteca.registrarUsuario(nombre, id);
                        break;
                    case 2:
                        // Llamar al método para agregar libro al catálogo
                        System.out.print("Ingrese el título del libro: ");
                        String tituloLibro = scanner.next();
                        System.out.print("Ingrese el autor del libro: ");
                        String autorLibro = scanner.next();
                        System.out.print("Ingrese el ID del libro: ");
                        int idLibro = scanner.nextInt();
                        biblioteca.agregarLibro(tituloLibro, autorLibro, idLibro);
                        System.out.println("Libro agregado con éxito.");
                        break;
                    case 3:
                        // Llamar al método para prestar libro
                        System.out.print("Ingrese el nombre del usuario que presta el libro: ");
                        String nombreUsuario3 = scanner.next();
                        System.out.print("Ingrese el ID del libro a prestar: ");
                        int idLibroPrestar = scanner.nextInt();

                        // Verificar si el usuario existe
                        Usuario usuarioPrestar = Gestion_de_biblioteca.encontrarUsuarioPorNombre(nombreUsuario3);

                        if (usuarioPrestar != null) {
                            // Buscar el libro por su ID
                            Libro libroPrestar = Gestion_de_biblioteca.encontrarLibroPorID(idLibroPrestar);

                            if (libroPrestar != null) {
                                // Prestar el libro
                                libroPrestar.prestarLibro(usuarioPrestar);
                            } else {
                                System.out.println("El libro no existe.");
                            }
                        } else {
                            System.out.println("El usuario no existe.");
                        }
                        break;
                    case 4:
                        // Llamando al método para devolver libro
                        System.out.print("Ingrese el nombre del usuario que devuelve el libro: ");
                        String nombreUsuario4 = scanner.next();
                        System.out.print("Ingrese el ID del libro a devolver: ");
                        int idLibroDevolver = scanner.nextInt();

                        // Verificar si el usuario existe
                        Usuario usuarioDevolver = encontrarUsuarioPorNombre(nombreUsuario4);
                        
                        if (usuarioDevolver != null) {
                            // Buscar el libro por su ID
                            Libro libroDevolver = encontrarLibroPorID(idLibroDevolver);

                            if (libroDevolver != null) {
                                // Llama al método para devolver el libro
                                if (biblioteca.devolverLibro(usuarioDevolver, libroDevolver)) {
                                    System.out.println("Libro devuelto con éxito.");
                                } else {
                                    System.out.println("El libro no se ha prestado a este usuario.");
                                }
                            } else {
                                System.out.println("Libro no encontrado.");
                            }
                        } else {
                            System.out.println("Usuario no encontrado.");
                        }
                        break;
                    case 5:
                        // Llamar al método para ver historial de préstamos
                        System.out.print("Ingrese el nombre del usuario cuyo historial de préstamos desea ver: ");
                        String nombreUsuario5 = scanner.next();

                        // Verificar si el usuario existe
                        Usuario usuarioHistorial = encontrarUsuarioPorNombre(nombreUsuario5);
                        
                        if (usuarioHistorial != null) {
                            // Llama al método para ver el historial de préstamos
                            List<Prestamo> historialPrestamos = biblioteca.verHistorialPrestamosUsuarioEspecifico(usuarioHistorial);

                            if (!historialPrestamos.isEmpty()) {
                                System.out.println("Historial de préstamos para el usuario " + usuarioHistorial.getNombre() + ":");
                                for (Prestamo prestamo : historialPrestamos) {
                                    System.out.println("Libro: " + prestamo.getLibro().getTitulo() + " - Fecha de préstamo: " + prestamo.getFechaPrestamo());
                                }
                            } else {
                                System.out.println("El usuario no tiene historial de préstamos.");
                            }
                        } else {
                            System.out.println("Usuario no encontrado.");
                        }
                        break;
                    case 6:
                        // Llamar al método para mostrar multas pendientes
                        biblioteca.mostrarMultasPendientes();
                        break;
                    case 7:
                        // Llamar al método para mostrar notificaciones
                        System.out.print("Introduce el nombre de usuario: ");
                        String nombreUsuarios7 = scanner.next();
                        Usuario usuario = encontrarUsuarioPorNombre(nombreUsuarios7);
                        if (usuario != null) {
                            usuario.mostrarNotificaciones();
                        } else {
                            System.out.println("Usuario no encontrado.");
                        }
                        break;
                    case 8:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opción no válida. Introduce un número válido.");
                }

            } while (opcion != 8);
            scanner.close();
        }
    }
}

// No se lo que hice JAJAJAJ