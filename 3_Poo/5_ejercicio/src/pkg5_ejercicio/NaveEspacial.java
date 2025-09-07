/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5_ejercicio;

/**
 *
 * @author agust
 */
public class NaveEspacial {
    String nombre;
    int combustible;
    
    public void despegar(){
        if (combustible >=5) {//tomamos el minimo para poderavanzar 5 unidades
            combustible -=5;
            System.out.println("la nave"+ nombre + " autorizado para despegar..");
        } else {
            System.out.println("combustible insuficiente,recargar!");
        }
    }
         // Método para avanzar cierta distancia
         public void avanzar(int distancia) {
            distancia = 0; // cada unidad de distancia consume 2 de combustible
            if (combustible >=5 ) { //la cantidad minima para poder avanzar es 5
                distancia ++;
            System.out.println("️ La nave " + nombre + " avanzó " + distancia + " unidades.");
        }else {
                System.out.println("la nave no puede avanzar");
            }
       }
         public void recargarCombustible(int cantidad) {
             cantidad = 5;//minima recarga para poder avanzar
         if (combustible <= 5) {
            combustible += cantidad;
            System.out.println(" La nave recargó " + cantidad + " unidades de combustible.");
        } 
         }
          public void mostrarEstado() {
          System.out.println("Estado de la nave");
          System.out.println("Nombre: " + nombre);
          System.out.println("Combustible: " + combustible );
     }
}
