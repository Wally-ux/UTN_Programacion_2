/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author agust
 */
public class Libro {
    private String isbn;             // Identificador único
    private String titulo;          
    private int anioPublicacion;     
    private Autor autor;             

    //constructor Libro
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    // Muestra título, ISBN, año y autor
    public String mostrarInfo() {
        //  mostrar solo el nombre del autor 
       
        return "Libro{titulo: " + titulo +
               ", ISBN: " + isbn +
               ", año: " + anioPublicacion +
               ", autor: " + autor.getNombre() +
               "}";
        
        
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
}
