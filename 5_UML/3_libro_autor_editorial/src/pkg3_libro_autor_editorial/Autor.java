/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3_libro_autor_editorial;

/**
 *
 * @author agust
 */
public class Autor {
    private String nombre;
    private String nacionalidad;
    
    public Autor (String nombre , String nacionalidad){
        this.nombre = nombre;
        this.nombre = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
    
}
