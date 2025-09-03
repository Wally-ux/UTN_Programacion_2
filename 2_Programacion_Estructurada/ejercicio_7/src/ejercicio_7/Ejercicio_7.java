/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicio_7 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int nota;
      
        do {            
            System.out.print("Ingrese una nota (0-10): ");
            nota = input.nextInt();
            if (nota <0 || nota >10 ) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while ( (nota < 0 || nota > 10));//mientras sea verdadero repite el ciclo 
            
       
        System.out.println("Nota guardada correctamente: " + nota);
    } 
         
}
    

