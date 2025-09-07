/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2_ejercicio;

/**
 *
 * @author agust
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascotas mas= new Mascotas();
        
        mas.nombre="Ramon";
        mas.especie= "Caniche";
        mas.edad= 2;
        
        mas.mostrarInfo();
        mas.cumplirAnios(); // ahora Ramon cumple años
        System.out.println("\nDespués de cumplir años:");
        mas.mostrarInfo();//suma 1 año por el metodo cumpliaraños

    }
    
}
