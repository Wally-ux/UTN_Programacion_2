/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg13_generadorqr_usuario_codigoqr;

/**
 *
 * @author agust
 */
public class GeneradorQR {
     // Método de creación_dependencia de creación
    // Recibimos el valor y el usuario y devolvemos un nuevo CodigoQR
    public CodigoQR generar(String valor, Usuario usuario) {
        // Creamos el código QR a partir del valor y el usuario
        CodigoQR codigo = new CodigoQR(valor, usuario);
        return codigo;
    }
}
