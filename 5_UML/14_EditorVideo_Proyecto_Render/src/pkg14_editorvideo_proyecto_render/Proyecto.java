/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14_editorvideo_proyecto_render;

/**
 *
 * @author agust
 */
public class Proyecto {
    //Atributos
    private String nombre;
    private int duracionMin;  // duración en minutos

    // Constructor
    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    // Para mostrar el proyecto
    @Override
    public String toString() {
        return "Proyecto{nombre='" + nombre + "', duracionMin=" + duracionMin + "}";
    }
}

