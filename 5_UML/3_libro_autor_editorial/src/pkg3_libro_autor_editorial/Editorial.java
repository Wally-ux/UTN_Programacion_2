/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3_libro_autor_editorial;

/**
 *
 * @author agust
 */
public class Editorial {
    private String nombre;
    private String direccion;
    
    public Editorial (String nombre , String direccion) {
        this.nombre =nombre;
        this.direccion= direccion;
        
   }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Editorial{\n" + "nombre=" + nombre + "\n"+  ", direccion=" + direccion + '}';
    }
   
}
