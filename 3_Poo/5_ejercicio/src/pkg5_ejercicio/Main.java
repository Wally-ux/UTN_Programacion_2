/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_ejercicio;

/**
 *
 * @author agust
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         NaveEspacial nave = new NaveEspacial();
        nave.nombre = "Interestelar";
        nave.combustible = 50;
        
        nave.mostrarEstado();
           // Intentar avanzar sin recargar
        nave.avanzar(20);
        // Recargar combustible
        nave.recargarCombustible(30); 
        
        nave.avanzar(20); 

        // Mostrar estado final
        nave.mostrarEstado();
    }
  }
    
