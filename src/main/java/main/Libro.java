package main;

/**
 * Representa un libro con título, autor y número de páginas.
 * Cada libro está asociado a un {@link Autor}.
 * 
 * @author Pablo Gonzalez
 * @version 1.0
 */
public class Libro {
    private String titulo;
    private Autor autor;
    private int paginas;

    /**
     * Constructor de la clase Libro.
     * 
     * @param titulo  Título del libro.
     * @param autor   Autor del libro (objeto {@link Autor}).
     * @param paginas Número de páginas del libro.
     * @throws IllegalArgumentException Si el número de páginas es negativo o cero.
     */
    public Libro(String titulo, Autor autor, int paginas) {
        if (paginas <= 0) {
            throw new IllegalArgumentException("El número de páginas debe ser mayor a 0.");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    /**
     * Obtiene el título del libro.
     * 
     * @return Título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece un nuevo título para el libro.
     * 
     * @param titulo Nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     * 
     * @return Objeto {@link Autor} correspondiente al autor del libro.
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * Establece un nuevo autor para el libro.
     * 
     * @param autor Nuevo autor del libro.
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el número de páginas del libro.
     * 
     * @return Número de páginas del libro.
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * Establece un nuevo número de páginas para el libro.
     * 
     * @param paginas Nuevo número de páginas.
     * @throws IllegalArgumentException Si el número de páginas es menor o igual a 0.
     */
    public void setPaginas(int paginas) {
        if (paginas <= 0) {
            throw new IllegalArgumentException("El número de páginas debe ser mayor a 0.");
        }
        this.paginas = paginas;
    }

    /**
     * Devuelve una representación en cadena del libro.
     * 
     * @return Cadena con la información del libro.
     */
    @Override
    public String toString() {
        return "Libro: " + titulo + " | " + autor + " | " + paginas + " páginas";
    }
}
