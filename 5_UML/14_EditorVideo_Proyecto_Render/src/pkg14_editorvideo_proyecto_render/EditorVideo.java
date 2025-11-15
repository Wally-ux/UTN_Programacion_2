/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14_editorvideo_proyecto_render;

/**
 *
 * @author agust
 */
public class EditorVideo {
        // Método de creación (dependencia de creación)
    // No devuelve nada (void), solo crea el Render y muestra un mensaje
    public void exportar(String formato, Proyecto proyecto) {
        // Creamos el render a partir del proyecto y el formato
        Render render = new Render(formato, proyecto);

        // Mostramos un mensaje de exportación
        System.out.println("Exportando  \"" 
                + proyecto.getNombre() 
                + "\" en el formato " + formato + "...");
        System.out.println("Render generado: " + render);
       
    }
}

