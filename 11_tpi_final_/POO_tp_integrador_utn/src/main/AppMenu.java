/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


import Service.HistoriaClinicaServiceImpl; 
import java.util.Scanner;
import DAO.PacienteDAO;
import Service.PacienteServiceImpl;
import main.MenuHandler;
import DAO.HistoriaClinicaDAO; 

/**
 *
 * @author agust
 */
       public  class AppMenu {
      // Servicios para manejar la lógica de gestión de paciente e historia clínica
      private final Scanner scanner;
      private final MenuHandler menuHandler;
      private boolean running;
     
        // Constructor
       
         public AppMenu() {
            this.scanner = new Scanner(System.in);

       
        
         PacienteDAO pacienteDAO = new PacienteDAO();
         PacienteServiceImpl pacienteService = new PacienteServiceImpl(pacienteDAO);
         
         // NUEVO: DAO y Service de Historia Clínica
        HistoriaClinicaDAO historiaClinicaDAO = new HistoriaClinicaDAO();
        HistoriaClinicaServiceImpl historiaClinicaService = new HistoriaClinicaServiceImpl(historiaClinicaDAO);

        // Le pasamos scanner y service al manejador del menú
        this.menuHandler = new MenuHandler(scanner, pacienteService,historiaClinicaService);
        this.running = true;
    }
         // Punto de entrada del programa
        public  static void main(String[] args) {
            AppMenu app = new AppMenu();
            app.run();
        }
        // Bucle principal del menú
         public void run() {
             while(running){
                try {
                    MenuDisplay.mostrarMenuPrincipal();
                    int opcion= Integer.parseInt(scanner.nextLine());
                   
                    processOption(opcion);
                } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                }
            }
             scanner.close();
        }
        

         private void processOption(int opcion) {
        switch (opcion) {
        case 1 -> menuHandler.crearPaciente();
        case 2 -> menuHandler.listarPacientes();
        case 3 -> menuHandler.buscarPacientePorDni();    //  buscar por DNI
        case 4 -> menuHandler.actualizarPaciente();
        case 5 -> menuHandler.eliminarPaciente();
        case 6 -> menuHandler.crearHistoriaClinica();
        case 7 -> menuHandler.listarHistoriasClinicas();
        case 0 -> {
            System.out.println("Saliendo...");
            running = false;
        }
        default -> System.out.println("Opción no válida.");
    }
}
       }