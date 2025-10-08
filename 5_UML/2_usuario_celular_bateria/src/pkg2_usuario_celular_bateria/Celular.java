/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2_usuario_celular_bateria;

/**
 *
 * @author agust
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;

    // Agregación 
    private Bateria bateria;

    // Asociación bidireccional
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
}
}
