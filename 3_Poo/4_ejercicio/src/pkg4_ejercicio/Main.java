/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_ejercicio;

/**
 *
 * @author agust
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gallina g1= new Gallina();
        g1.idGallina = "Gallina01";
        g1.edad = 1;
        g1.huevosPuestos = 0;
        
        Gallina g2 = new Gallina();
        g2.idGallina = "Gallina02";
        g2.edad = 2;
        g2.huevosPuestos = 2;
        //mostramos los estados iniciales de las gallinas
        g1.mostrarEstado();
        g2.mostrarEstado();
        //simulamos las acciones para cada gallina
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();
        //mostramos los estados finales
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
    
}
