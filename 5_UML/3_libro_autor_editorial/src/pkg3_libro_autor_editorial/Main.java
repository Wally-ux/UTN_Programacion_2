/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3_libro_autor_editorial;

/**
 *
 * @author agust
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor autor = new Autor("julio cortazar", "Argentina");
        Editorial editorial = new Editorial("Terciopelo", "chihuahua 2021");


        Libro libro = new Libro("Bestiario", "978-987-1234567", autor, editorial);


        System.out.println(libro);


    }
   }
    

