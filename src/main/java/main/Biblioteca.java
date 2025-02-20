package main;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa una biblioteca que almacena una colección de libros.
 * Permite agregar libros y listar los libros disponibles.
 * 
 * @author Pablo Gonzalez
 * @version 1.0
 */
public class Biblioteca {
    private List<Libro> libros;

    /**
     * Constructor de la clase Biblioteca.
     * Inicializa la lista de libros.
     */
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    /**
     * Agrega un libro a la biblioteca.
     * 
     * @param libro Objeto {@link Libro} que se desea agregar.
     * @throws NullPointerException Si el libro es null.
     */
    public void agregarLibro(Libro libro) {
        if (libro == null) {
            throw new NullPointerException("El libro no puede ser null.");
        }
        libros.add(libro);
    }

    /**
     * Lista todos los libros en la biblioteca.
     * Si no hay libros, muestra un mensaje indicando que la biblioteca está vacía.
     */
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros.");
        } else {
            System.out.println("Libros en la biblioteca:");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}
