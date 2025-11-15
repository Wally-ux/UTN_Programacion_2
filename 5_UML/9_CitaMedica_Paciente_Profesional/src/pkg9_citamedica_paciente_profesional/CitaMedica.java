/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9_citamedica_paciente_profesional;

/**
 *
 * @author agust
 */
public class CitaMedica {
    
    // Atributos propios de la cita
    private String fecha;    // por simplicidad, usamos String
    private String hora;

    // Asociación unidireccional: la cita conoce al paciente
    private Paciente paciente;

    // Asociación unidireccional: la cita conoce al profesional
    private Profesional profesional;

    // Constructor: se crea una cita con fecha, hora, paciente y profesional
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    // Getters y setters de fecha y hora
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    // Getters y setters de paciente y profesional
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "CitaMedica{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", paciente=" + paciente +
                ", profesional=" + profesional +
                '}';
    }
}

