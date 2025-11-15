/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9_citamedica_paciente_profesional;

/**
 *
 * @author agust
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // 1) Creamos un paciente
        Paciente paciente1 = new Paciente("Osvaldo Laport", "OSDE 310");

        // 2) Creamos un profesional
        Profesional profesional1 = new Profesional("Dra. López", "Clínica Médica");

        // 3) Creamos una cita médica que une paciente + profesional
        CitaMedica cita1 = new CitaMedica(
                "2025-11-25",  // fecha de la cita
                "10:30",       // hora de la cita
                paciente1,     // paciente asociado
                profesional1   // profesional asociado
        );

        // 4) Mostramos los datos de la cita
        System.out.println("=== Cita médica ===");
        System.out.println("Fecha: " + cita1.getFecha());
        System.out.println("Hora: " + cita1.getHora());

        // 5) Mostramos los datos del paciente de esa cita
        System.out.println("\n=== Paciente ===");
        System.out.println("Nombre: " + cita1.getPaciente().getNombre());
        System.out.println("Obra social: " + cita1.getPaciente().getObraSocial());

        // 6) Mostramos los datos del profesional de esa cita
        System.out.println("\n=== Profesional ===");
        System.out.println("Nombre: " + cita1.getProfesional().getNombre());
        System.out.println("Especialidad: " + cita1.getProfesional().getEspecialidad());

        // 7) Mostramos todo junto usando toString
        System.out.println("\n--- toString completo ---");
        System.out.println(cita1);
    }
}
    