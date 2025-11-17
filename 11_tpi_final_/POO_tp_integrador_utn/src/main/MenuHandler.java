/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Models.HistoriaClinica;
import Models.Paciente;
import Service.PacienteServiceImpl;
import java.util.List;
import java.util.Scanner;

import Service.HistoriaClinicaServiceImpl; 
import Models.GrupoSanguineo; 

/**
 *
 * @author agust
 */
public class MenuHandler {
        private final Scanner scanner;
        private final PacienteServiceImpl pacienteService;
        private final HistoriaClinicaServiceImpl historiaService;       
    
        public MenuHandler(Scanner scanner, PacienteServiceImpl pacienteService, HistoriaClinicaServiceImpl historiaService) {
        if (scanner == null) {
            throw new IllegalArgumentException("Scanner no puede ser null");
        }
        if (pacienteService == null) {
            throw new IllegalArgumentException("PersonaService no puede ser null");
        }
        if (historiaService == null) {                                
             throw new IllegalArgumentException("HistoriaClinicaService no puede ser null");
        }
        this.scanner = scanner;
        this.pacienteService = pacienteService;
        this.historiaService = historiaService;   
    }
  
         public void crearPaciente() {
        try {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine().trim();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine().trim();
            System.out.print("DNI: ");
            String dni = scanner.nextLine().trim();

          

           Paciente paciente = new Paciente(nombre, apellido, dni);
            
            pacienteService.insertar(paciente);
            System.out.println("Persona creada exitosamente con ID: " + paciente.getId());
        } catch (Exception e) {
            System.err.println("Error al crear persona: " + e.getMessage());
        }
    }

         public void listarPacientes() {
            try {
            // Obtenemos todos los pacientes
            List<Paciente> pacientes = pacienteService.getAll();

            if (pacientes == null || pacientes.isEmpty()) {
            System.out.println("No se encontraron personas.");
            return;
        }

        for (Paciente p : pacientes) {
            System.out.print(
                    "ID: " + p.getId()
                    + ", Nombre: " + p.getNombre()
                    + ", Apellido: " + p.getApellido()
                    + ", DNI: " + p.getDni()
            );
        
         // =====  MOSTRAR HISTORIA CLÍNICA SI TIENE =====
            if (p.getHistoriaClinica() != null  && p.getHistoriaClinica().getId() > 0) {
                System.out.print( " | Historia Clínica: " 
                    + p.getHistoriaClinica().getNroHistoria()
                    + " (ID HC: " + p.getHistoriaClinica().getId() + ")"
                );
            } else {
                System.out.print(" | Historia Clínica: SIN ASIGNAR");
            }

            System.out.println(); // salto de línea
             }

            } catch (Exception e) {
            System.err.println("Error al listar pacientes: " + e.getMessage());
            }

         }
            
         public void actualizarPaciente() {
            try {
            System.out.print("ID del paciente a actualizar: ");
            Long id = Long.parseLong(scanner.nextLine());   // ID como Long
            Paciente p = pacienteService.getById(id);

            if (p == null) {
                System.out.println("Paciente no encontrada.");
                return;
            }

            System.out.print("Nuevo nombre (actual: " + p.getNombre() + ", Enter para mantener): ");
            String nombre = scanner.nextLine().trim();
            if (!nombre.isEmpty()) {
                p.setNombre(nombre);
            }

            System.out.print("Nuevo apellido (actual: " + p.getApellido() + ", Enter para mantener): ");
            String apellido = scanner.nextLine().trim();
            if (!apellido.isEmpty()) {
                p.setApellido(apellido);
            }

            System.out.print("Nuevo DNI (actual: " + p.getDni() + ", Enter para mantener): ");
            String dni = scanner.nextLine().trim();
            if (!dni.isEmpty()) {
                p.setDni(dni);
            }
            }catch (NumberFormatException e) {
                System.err.println("ID inválido. Debe ser un número.");
            } catch (Exception e) {
                System.err.println("Error al actualizar paciente: " + e.getMessage());
             }
}
            
         public void eliminarPaciente() {
            try {
            System.out.print("ID de la paciente a eliminar: ");
            Long id = Long.parseLong(scanner.nextLine());   // ID como Long
            pacienteService.eliminar(id);
            System.out.println("Paciente eliminada exitosamente.");
            } catch (Exception e) {
            System.err.println("Error al eliminar paciente: " + e.getMessage());
        }
    }
             
         public void buscarPacientePorDni() {
        try {
        System.out.print("DNI del paciente a buscar: ");
        String dni = scanner.nextLine().trim();

        Paciente p = pacienteService.getByDni(dni);  // método en el service

        if (p == null) {
            System.out.println("No se encontró ningún paciente con ese DNI.");
            return;
        }

        System.out.println("Paciente encontrado:");
        System.out.println(
            "ID: " + p.getId()
            + ", Nombre: " + p.getNombre()
            + ", Apellido: " + p.getApellido()
            + ", DNI: " + p.getDni()
        );
        } catch (Exception e) {
        System.err.println("Error al buscar paciente por DNI: " + e.getMessage());
         }
     }
  
        // =======================
        // HISTORIA CLINICA
        // =======================

        public void crearHistoriaClinica() {
        try {
               // primero preguntamos a qué paciente se la vamos a crear
        System.out.print("ID del paciente al que se le creará la historia clínica: "); 
        Long idPaciente = Long.parseLong(scanner.nextLine());                          

        Paciente paciente = pacienteService.getById(idPaciente);                        
        if (paciente == null) {                                                         
            System.out.println("No se encontró un paciente con ese ID.");                 
            return;                                                                     
        }                                                                              

        // validamos la relación 1 a 1 (si ya tiene HC, no dejar crear otra)
        if (paciente.getHistoriaClinica() != null                                         
                && paciente.getHistoriaClinica().getId() > 0 ) {                           
            System.out.println("El paciente ya tiene una historia clínica asociada (ID "
                    + paciente.getHistoriaClinica().getId() + ").");                      
            return;                                                                      
        }                                                                                 

            
        System.out.print("Nro Historia (ej: HC001): ");
        String nro = scanner.nextLine().trim();

        System.out.print("Grupo sanguíneo (ej: O_POS, A_NEG): ");
        String grupoInput = scanner.nextLine().trim();
         GrupoSanguineo grupo = null;
            try {
                grupo = GrupoSanguineo.valueOf(grupoInput.toUpperCase());
            } catch (IllegalArgumentException ex) {
                System.out.println("Grupo sanguíneo inválido, se guardará como null.");
            }  
        System.out.print("Antecedentes: ");
        String antecedentes = scanner.nextLine().trim();

        System.out.print("Medicación actual: ");
        String medicacion = scanner.nextLine().trim();

        System.out.print("Observaciones: ");
        String obs = scanner.nextLine().trim();

        HistoriaClinica hc = new HistoriaClinica();
            
        hc.setNroHistoria(nro);
         hc.setGrupoSanguineo(grupo);
         hc.setAntecedentes(antecedentes);
         hc.setMedicacionActual(medicacion);
         hc.setObservaciones(obs);
         //insertamos la hc para que obtenga su id
         historiaService.insertar(hc);
         //asociamos la hc al paciente y actualizamos
         paciente.setHistoriaClinica(hc);                        
         pacienteService.actualizar(paciente);  
         
         System.out.println(
        "Historia clínica creada -> ID HC: " + hc.getId()
         + ", Nro: " + hc.getNroHistoria()
         + " | Asociada al paciente -> ID Paciente: " + paciente.getId()
          + ", Nombre: " + paciente.getNombre() + " " + paciente.getApellido()
        );

         } catch (NumberFormatException e) {                                   
        System.err.println("ID de paciente inválido. Debe ser un número.");                
         } catch (Exception e) {
        System.err.println("Error al crear historia clínica: " + e.getMessage());
         }
    }

        public void listarHistoriasClinicas() {
        try {
        List<HistoriaClinica> lista = historiaService.getAll();

        if (lista == null || lista.isEmpty()) {
                System.out.println("No hay historias clínicas registradas.");
                return;
        }

        for (HistoriaClinica hc : lista) {
            System.out.println(hc);
        }

    } catch (Exception e) {
        System.err.println("Error al listar historias clínicas: " + e.getMessage());
    }
}
}

