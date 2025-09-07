/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3_ejercicio;

/**
 *
 * @author agust
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un libro con datos iniciales
        Libro libro = new Libro();
        //los setter no son variables,son metodos y lo llamamos como tal
        libro.setTitulo("la rayuela");
        libro.setAutor ("Julio Cortazar");
        libro.setAnioPublicacion (1963); 
        
    
        libro.mostrarInfo();
        System.out.println(" ");
        //  valor inválido
        libro.setAnioPublicacion(-1990); 
        libro.setAnioPublicacion(2026);  
        
        System.out.println(" ");
        libro.mostrarInfo();
        // Modificamos al valor que si se publico 
        libro.setAnioPublicacion(1963);  
        libro.mostrarInfo();
        
       
    }
               
    }
    
