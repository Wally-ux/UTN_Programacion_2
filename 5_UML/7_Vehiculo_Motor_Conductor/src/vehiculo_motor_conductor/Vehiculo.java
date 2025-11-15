/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo_motor_conductor;

/**
 *
 * @author agust
 */
public class Vehiculo {
    // Atributos básicos
    private String patente;
    private String modelo;

    // Agregación: un Vehiculo tiene un Motor, pero el Motor puede existir aparte
    private Motor motor;

    // Asociación bidireccional con Conductor
    private Conductor conductor;

    // Constructor de vehicuo
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    // Getters y setters
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    // Asociación bidireccional: Vehiculo <-> Conductor
    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        // Si el conductor no tiene seteado este vehículo, lo sincronizamos
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                ", conductor=" + (conductor != null ? conductor.getNombre() : "sin conductor") +
                '}';
    }

  
}

