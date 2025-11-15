/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg11_reproductor_cancion_artista;

/**
 *
 * @author agust
 */
public class Reproductor {
       // Dependencia de uso: nuestro método recibe una Cancion para reproducirla
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo());
        System.out.println("Artista: " + cancion.getArtista().getNombre());
    }
}
