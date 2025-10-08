/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4_tarjetacredito_banco_cliente;


public class Cliente {
    private String nombre;
    private final String dni;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { 
        return nombre; }
    
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    public String getDni() { 
        return dni; }

    @Override
    public String toString() {
        return "Cliente{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}

