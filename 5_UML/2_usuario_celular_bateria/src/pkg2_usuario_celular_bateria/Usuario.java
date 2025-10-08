/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2_usuario_celular_bateria;

/**
 *
 * @author agust
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; //encale con la otra clase

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { 
            return nombre;
} 
    public String getDni() { 
        return dni;
} 
    public Celular getCelular() { 
            return celular;
 }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

  
}
