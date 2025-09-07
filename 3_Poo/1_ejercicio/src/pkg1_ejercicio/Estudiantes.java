/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1_ejercicio;

/**
 *
 * @author agust
 */
public class Estudiantes {
    String nombre ;
    String apellido ;
    String curso ;
    int calificacion ;
    
    public void  mostrarinfo() {
            System.out.println("Nombre: " 
                    + nombre + "\nApellido: " 
                    + apellido + "\nCurso: " 
                    + curso +"\nCalificacion: " 
                    + calificacion);
    }         
    public void subirCalificacion(int puntos) {
        calificacion += puntos;
    }
    public void bajarCalificacion(int puntos) {
        calificacion -= puntos;
        
    
    }
}

        

