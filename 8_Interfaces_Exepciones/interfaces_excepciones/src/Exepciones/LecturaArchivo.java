/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class LecturaArchivo {
     public static void main(String[] args) {  
         Scanner scan = new Scanner(System.in);        

        System.out.print("Ingrese la ruta del archivo de texto: "); 
        String nombre = scan.nextLine();                 // Lee la ruta ingresada
      

        
        try {
        File archivo = new File(nombre);  // Crea un objeto File con el nombre del archivo
         BufferedReader br = new BufferedReader(new FileReader(archivo)); // Abre el archivo para leerlo

        System.out.println(br.readLine()); // Lee e imprime la primera línea del archivo
        }
        catch (FileNotFoundException e) { // Si el archivo no existe, entra en este bloque
        System.out.println("Atencion!!Error: El archivo no se encuentra.");
        }
        catch (IOException ex) { // Si ocurre un error general de entrada/salida (lectura o cierre)
          System.out.println("Error ");
        System.out.println(ex.getMessage()); // Muestra el mensaje técnico del error
    }
   }
}
