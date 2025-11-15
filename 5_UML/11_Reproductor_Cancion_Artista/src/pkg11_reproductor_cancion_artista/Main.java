/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11_reproductor_cancion_artista;

/**
 *
 * @author agust
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // Creamos un artista
        Artista artista1 = new Artista("Patricio Rey", "Rock");

        // creamos  una canción asociada a ese artista
        Cancion cancion1 = new Cancion("MotorPsico", artista1);

        // creamos  un reproductor
        Reproductor reproductor = new Reproductor();

        // por ultimo reporducimos  la canción (dependencia de uso)
        reproductor.reproducir(cancion1);
    }
    }
    
