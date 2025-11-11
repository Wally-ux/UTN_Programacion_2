/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exepciones;

/**
 *
 * @author agust
 */
public class EdadInvalidaException extends Exception {
    // Constructor que recibe un mensaje personalizado
    public EdadInvalidaException(String mensaje) {
        super(mensaje); // pasa el mensaje a la clase padre (Exception)
    
}
}