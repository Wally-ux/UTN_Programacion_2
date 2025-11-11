/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exepciones;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class ExepcionPersonalizada {
  public static void main(String[] args) {
      
      try (Scanner scaner = new Scanner(System.in)) {     // try-with-resources: se cierra solo
            System.out.print("Ingrese su edad: ");
            int edad = scaner.nextInt();                    // lee entero

            if (edad < 0 || edad > 120) {                  // valida rango
                throw new EdadInvalidaException("Edad fuera de rango (0 - 120).");
            }

            System.out.println("Edad válida: " + edad);     // OK si pasó la validación
        }
        catch (EdadInvalidaException e) {                   
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {                               
            System.out.println(" Entrada inválida.");
        }
    }
}


