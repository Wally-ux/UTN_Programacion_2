/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces_excepciones;

/**
 *
 * @author agust
 */
public class Cliente implements Notificable{ //un cliente puede ser notificado
    private String nombre;
    
    //constrcutor
    public  Cliente (String nombre ){
        this.nombre = nombre;
    }
        
    @Override
    public void notificar(String mensaje) { //imlementamos la notificacion
        System.out.println("Usuario: " +nombre+ " , tu pedido tiene el siguiente estado: " + mensaje);
    }
    
    
}
