/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.List;

/**
 *
 * @author agust
 */
public class Main {
    public static void main(String[] args) {
         // 1) Creamos una biblioteca
        Biblioteca biblio = new Biblioteca("Biblioteca de barrio");
        
        //creamos autotes
        Autor au1= new Autor ("1", "Julio Cortazar", " Argentino");
        Autor au2= new Autor ("2", "Edgar Allan Pou", " EEUU");
        Autor au3= new Autor ("3", "Gabriel Garcia Marquez ", " Colombia");
        
        //  Agregamos 5 libros a la biblioteca (asociados a los autores creados)

         // Julio Cortazar (au1)
        biblio.agregarLibro("ISBN-001", "Rayuela", 1963, au1);
        biblio.agregarLibro("ISBN-002", "Bestiario", 1951, au1);

        // Edgar Allan Poe (au2)
        biblio.agregarLibro("ISBN-003", "Narraciones extraordinarias", 1849, au2);
        biblio.agregarLibro("ISBN-004", "El cuervo", 1845, au2);

        // Gabriel Garcia Marquez (au3)
        biblio.agregarLibro("ISBN-005", "Cien años de soledad", 1967, au3);

        // (Opcional) verificar
        System.out.println("Libros cargados: " + biblio.obtenerCantidadLibros());
        biblio.listarLibros();
        
        //5 buscamos libro por su ISBN y mostramos su info
        System.out.println("\n-----------buscamos un libro por ISBN ISBN-003-----------------\n");
        System.out.println(biblio.buscarLibroPorIsbn("ISBN-003").mostrarInfo());
        
        // Buscamos los libros del mismo año de publicación
        int anioFiltro = 1967;  // <-- elegí un año que exista en tus libros
        List<Libro> librosPorAnio = biblio.filtrarLibrosPorAnio(anioFiltro);

        System.out.println("Los libros encontrados del año " + anioFiltro + " son:");
        for (Libro libro : librosPorAnio) {
        // mostrarInfo() devuelve String -> imprimirlo
        System.out.println(libro.mostrarInfo());
            System.out.println(" ");
        // si tuvieras toString() en Libro, podrías hacer: System.out.println(libro);
    }
        
        //7_eliminamos un libro  por su isbn
        System.out.println("La cantidad de libros antes de eliminar son " + biblio.obtenerCantidadLibros());
       //eliminamos el libro con isbn 005
        biblio.eliminarLibro("ISBN-005");
        
        //8_mosartasmos la cantidad de libros en la biblioteca despues de eliminar uno
        System.out.println("La cantidad de libros despues de eliminar es: " + biblio.obtenerCantidadLibros());
        System.out.println("");
        
        //9 listar 
        System.out.println("mostramos los autores disponibles ");
        biblio.mostrarAutoresDisponibles();
}
}
