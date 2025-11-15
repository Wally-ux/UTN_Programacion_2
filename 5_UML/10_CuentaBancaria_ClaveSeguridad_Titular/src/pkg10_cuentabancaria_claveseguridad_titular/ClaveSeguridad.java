/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10_cuentabancaria_claveseguridad_titular;

/**
 *
 * @author agust
 */
public class ClaveSeguridad {
  

// Representamos la clave de seguridad asociada a una cuenta
     private String codigo;
    private String ultimaModificacion;

  

    // Constructor
    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(String ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" +
                "codigo='" + codigo + '\'' +
                ", ultimaModificacion='" + ultimaModificacion + '\'' +
                '}';
    }
}

