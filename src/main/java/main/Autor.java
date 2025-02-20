package main;

/**
 * Representa un autor de un libro.
 * Contiene información sobre el nombre y la nacionalidad del autor.
 * 
 * @author Pablo Gonzalez
 * @version 1.0
 */
public class Autor {
    private String nombre;
    private String nacionalidad;

    /**
     * Constructor de la clase Autor.
     * 
     * @param nombre Nombre del autor.
     * @param nacionalidad Nacionalidad del autor.
     */
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    /**
     * Obtiene el nombre del autor.
     * 
     * @return Nombre del autor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el autor.
     * 
     * @param nombre Nuevo nombre del autor.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la nacionalidad del autor.
     * 
     * @return Nacionalidad del autor.
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Establece una nueva nacionalidad para el autor.
     * 
     * @param nacionalidad Nueva nacionalidad del autor.
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Devuelve una representación en cadena del autor.
     * 
     * @return Cadena con el nombre y la nacionalidad del autor.
     */
    @Override
    public String toString() {
        return "Autor: " + nombre + " (" + nacionalidad + ")";
    }
}
