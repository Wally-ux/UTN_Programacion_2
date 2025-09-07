/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3_ejercicio;

/**
 *
 * @author agust
 */
public class Libro {
    // Atributos privados (encapsulados)
    private String titulo;
    private String autor;
    private int anioPublicacion;


    // Método para mostrar info del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion + " años");
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Setter validación
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 1800 && anioPublicacion <= 2025) { // años aproximado de imprenta
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println(anioPublicacion+" año de impresion invalido");
        }
    }


    }

