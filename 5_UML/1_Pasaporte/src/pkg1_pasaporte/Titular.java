/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1_pasaporte;


public class Titular {
private String nombre;
private String dni;
private Pasaporte pasaporte; 

public Titular(String nombre, String dni) { 
    this.nombre = nombre;
    this.dni = dni;
}

void setPasaporte(Pasaporte pas) { 
    this.pasaporte = pas; }

public Pasaporte getPasaporte() { 
    return pasaporte; }
// getters/setters básicos
    
}
