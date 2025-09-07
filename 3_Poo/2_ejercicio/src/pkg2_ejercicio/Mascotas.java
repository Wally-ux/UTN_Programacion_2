/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2_ejercicio;

/**
 *
 * @author agust
 */
public class Mascotas {
    String nombre;
    String especie;
    int edad;
    
    
    public void mostrarInfo(){
        System.out.println("Informacion de la mascota: ");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Raza:"+ especie);
        System.out.println("Edad: "+ edad + " años");
        
    }
    public void cumplirAnios(){
        edad += 1;//sumamos 1 año desde la edad actual de la mascota
    }
}

