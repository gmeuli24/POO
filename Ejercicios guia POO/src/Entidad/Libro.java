/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */
package Entidad;

/**
 *
 * @author Admin
 */
public class Libro {
    public int isbn;
    public String titulo;
    public String autor;
    public int npaginas;

 public Libro() {
    
}
    public Libro(int isbn, String titulo, String autor, int npaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.npaginas = npaginas;
    }
}

    
    

