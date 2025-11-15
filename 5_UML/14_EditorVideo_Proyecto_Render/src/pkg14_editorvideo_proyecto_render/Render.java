/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14_editorvideo_proyecto_render;

/**
 *
 * @author agust
 */
public class Render {
       // Atributos
    private String formato;   // ej: "MP4", "AVI"
    private Proyecto proyecto; // asociación unidireccional a Proyecto

    // Constructor
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    // Getters y setters
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    // Para mostrar el render
    @Override
    public String toString() {
        return "Render{formato='" + formato + "', proyecto=" + proyecto + "}";
    }
}

