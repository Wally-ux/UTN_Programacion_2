/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13_generadorqr_usuario_codigoqr;

/**
 *
 * @author agust
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creamos un usuario
        Usuario usuario = new Usuario("Walter Frias", "walter.fr@utn.com");

        // Creamos el generador de QR
        GeneradorQR generador = new GeneradorQR();

        // Generamos un código QR para ese usuario
        CodigoQR codigo = generador.generar("ACCESO-YA", usuario);

        // Mostramos el código QR generado
        System.out.println(codigo);
    }
    }
    

