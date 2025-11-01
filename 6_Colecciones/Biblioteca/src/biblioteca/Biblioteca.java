/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author agust
 */

public class Biblioteca {
      private String nombre;        // nombre de la biblioteca
         private List<Libro> libros;   // colección de libros

        // Constructor
        public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
        //metodo agregar libro 
     public void agregarLibro(String isbn, String titulo,
                         int anioPublicacion, Autor autor) {
    if (!isbn.equals("") && isbn != null && !titulo.equals("")
            && titulo != null && anioPublicacion > 0 && autor != null) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    }
     //LISTAMOS LIBROS 
    public void listarLibros() {
    System.out.println("La lista de libros de la biblioteca " + nombre + " es: ");
    for (Libro libro : libros) {
        System.out.println(libro.mostrarInfo());
    }
    }
    //metodo buscar por libro isbn
    public Libro buscarLibroPorIsbn(String isbn) {
    for (Libro libro : libros) {
        if (libro.getIsbn().equals(isbn)) {
            return libro;
        }
    }
    return null;
 }
    //metodo eliminar libro
    public void eliminarLibro(String isbn) {
    if (isbn != null) {
        Libro libroEliminar = this.buscarLibroPorIsbn(isbn);
        if (libroEliminar != null) {
            libros.remove(libroEliminar);
        }
    }
  }
    //metodo para obtener la cantidad en enteros de los libros
    public int obtenerCantidadLibros() {
    return libros.size();
}
    //filtramos libro por año
    public List<Libro> filtrarLibrosPorAnio(int anio) {
    List<Libro> librosPorAnio = new ArrayList<>();
    for (Libro libro : libros) {
        if (libro.getAnioPublicacion() == anio) {
            librosPorAnio.add(libro);
        }
    }
    return Collections.unmodifiableList(librosPorAnio);
}
    //metodo mostrar autores disponibles
    public void mostrarAutoresDisponibles() {
    for (Libro libro : libros) {
        System.out.println(libro.getAutor().mostrarInfo());
    }
}
}

  
        
