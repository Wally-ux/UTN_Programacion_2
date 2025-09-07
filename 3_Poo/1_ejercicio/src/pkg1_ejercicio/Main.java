/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1_ejercicio;

/**
 *
 * @author agust
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Estudiantes est= new Estudiantes(); //creamos estudiante usando la clase estudiante
       //objeto
       est.nombre = "Juan";
       est.apellido= "Perez";
       est.curso= "Programacion 2";
       est.calificacion= 7; 
    
       est.mostrarinfo();
        System.out.println(" ");
        System.out.println("Se sube la calificacion 2 puntos:");
       est.subirCalificacion(2);
        est.mostrarinfo();
         System.out.println(" ");
       System.out.println("Se baja la calificacion 1 puntos:");
       est.bajarCalificacion(1);
        est.mostrarinfo();
    }
    
}
