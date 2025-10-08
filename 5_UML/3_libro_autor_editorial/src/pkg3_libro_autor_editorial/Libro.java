/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3_libro_autor_editorial;

/**
 *
 * @author agust
 */
public class Libro {
    private String titulo;
    private String isbn;
 
   // Relacion unidireccional
    private Autor autor; // Asociación: Libro conoce a Autor
    private Editorial editorial; // Agregación: Libro referencia a Editorial


public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
    this.titulo = titulo;
    this.isbn = isbn;
    this.autor = autor;
    this.editorial = editorial;
}

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "Libro{\n" + "titulo= " 
                + titulo + "\n"   +" isbn=" 
                + isbn +"\n"+ " autor=" 
                + autor + "\n" +" editorial=" 
                + editorial + '}';
    }

}
