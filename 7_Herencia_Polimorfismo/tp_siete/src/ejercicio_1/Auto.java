/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

/**
 *
 * @author agust
 */
public class Auto extends Vehiculo  {
    // Extendemos de la clase vehiculo
   
    private int cantidadDePuertas;

    // Creamos el constructor que invocada a la superclase explicito
    public Auto(int cantidadDePuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    // Sobreescribimos al metodo mostrarInfo
    @Override
    public void mostrarInfo(){
        System.out.println("Modelo: " + this.modelo + " ,marca: " + this.marca + ", cantidad de puertas: " + cantidadDePuertas);
    }
}
    
