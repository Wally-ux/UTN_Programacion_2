/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces_excepciones;

/**
 *
 * @author agust
 */
public class Producto implements Pagable{
    private String nombre;
    private double Precio; //precio unitario

    public Producto(String nombre, double Precio) { //constructor 
        this.nombre = nombre;
        this.Precio = Precio;
    }
    
    //sobreescribimos el metodo que implementa a la interfaz pagable
    //implementamos el contrato un producto para su precio
    @Override
    public double calcularTotal(){
        return this.Precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
}


