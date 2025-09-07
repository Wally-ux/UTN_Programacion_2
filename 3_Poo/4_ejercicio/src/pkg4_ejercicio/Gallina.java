/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4_ejercicio;

/**
 *
 * @author agust
 */
public class Gallina {
    String idGallina;
    int edad;
    int huevosPuestos;
    
    public void ponerHuevo(){
        huevosPuestos ++;
    }
    public void envejecer (){
        edad++;
        
     }
    public void mostrarEstado(){
        System.out.println("La gallina: " + idGallina );
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("Edad: " +edad + " años" );
    }
    
}
