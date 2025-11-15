/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10_cuentabancaria_claveseguridad_titular;

/**
 *
 * @author agust
 */
public class CuentaBancaria {
    // Atributos propios de la cuenta
    private String cbu;
    private double saldo;

    // Composición: la Cuenta "contiene" una ClaveSeguridad
    private ClaveSeguridad claveSeguridad;

    // Asociación bidireccional: CuentaBancaria <-> Titular
    private Titular titular;

    // Constructor: creamos  la cuenta y su clave de seguridad ,composición
    public CuentaBancaria(String cbu, double saldo, String codigoClave, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        // La cuenta crea su propia clave - composición
        this.claveSeguridad = new ClaveSeguridad(codigoClave, ultimaModificacion);
    }

    // Getters y setters básicos
    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    // Método para actualizar la clave (sigue siendo composición)
    public void actualizarClave(String nuevoCodigo, String nuevaFecha) {
        this.claveSeguridad.setCodigo(nuevoCodigo);
        this.claveSeguridad.setUltimaModificacion(nuevaFecha);
    }

    // Asociación bidireccional con Titular
    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        // relacionamos con la talba titular
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "cbu='" + cbu + '\'' +
                ", saldo=" + saldo +
                ", claveSeguridad=" + claveSeguridad +
                ", titular=" + (titular != null ? titular.getNombre() : "sin titular") +
                '}';
    }
}

