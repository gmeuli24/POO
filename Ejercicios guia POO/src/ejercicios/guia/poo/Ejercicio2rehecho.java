/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */
package ejercicios.guia.poo;

import Entidad.Libro;

public class Ejercicio2rehecho {

    public static void main(String[] args) {
     
  Libro ln = new Libro(75456645, "Las Aventuras de juan", "Pindonga", 850);
  

  
        System.out.println(ln.autor+ln.isbn+ln.npaginas+ln.titulo"");
  
    }
    
}
