/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14_editorvideo_proyecto_render;

/**
 *
 * @author agust
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /// Creamos un proyecto de video
        Proyecto proyecto = new Proyecto("Video Clip, 15 años de guadalupe", 15);

        // Creamos el editor de video
        EditorVideo editor = new EditorVideo();

        // Exportamos el proyecto en un formato dado
        editor.exportar("MP4", proyecto);
    }
    }
    

