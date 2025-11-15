/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5_computadora_placa_propietario;

/**
 *
 * @author agust
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; //aociacoin bidireccional
    
//constructor con todos los atributos de la clase
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
  //getters & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }
//si computadora conoce al propietario , el propietario tambien conoce a la computadora
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        //evitamos el bucle infinito 
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }


}


