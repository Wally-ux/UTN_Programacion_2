/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

/**
 *
 * @author agust
 */
public class Vehiculo {
      // atributos 
    protected String marca;
    protected String modelo;

    // Creamos el cosntructor 
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Metodo para mostrar info del vehiculo 
    public void mostrarInfo(){
        System.out.println("Modelo: " + modelo + " ,marca: " + marca);
}
}
