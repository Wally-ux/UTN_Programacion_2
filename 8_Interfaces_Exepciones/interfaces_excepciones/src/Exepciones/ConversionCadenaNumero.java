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
public class ConversionCadenaNumero {
     public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);     

        System.out.print("Ingrese un texto para convertirlo en numero: ");  
        String texto = scan.nextLine();          

        try {                                      // Bloque que puede lanzar excepción
            int textoConvertido= Integer.parseInt(texto);  // Intenta convertir el texto a entero
            System.out.println("Conversión exitosa. El número es: " + textoConvertido);
        } 
        catch (NumberFormatException e) {          // Captura si el texto no es numérico
            System.out.println("Atencion!! Error: el valor ingresado no es un número válido.");
        } 
        finally {                                  // Se ejecuta siempre
            scan.close();                          // Cierra el Scanner
        }
    }
}
