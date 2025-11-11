/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 *
 * @author agust
 */
public class LeerArchivoTryWithResources {
     public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {                
            String ruta = teclado.nextLine();                           
            Path path = Path.of(ruta);                                  // crea objeto Path

            // try-with-resources: BufferedReader se cierra automáticamente
            try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
                String linea;                                           // variable para cada línea
                while ((linea = br.readLine()) != null) {               // lee hasta EOF
                    System.out.println(linea);                           // imprime la línea
                }
            }
            // Orden de los catch: primero el más específico
            catch (NoSuchFileException e) {                              // archivo no encontrado
                System.out.println(" No existe el archivo: " + e.getFile());
            }
            catch (IOException e) {                                      // otros errores de E/S
                System.out.println("️ Error de lectura: " + e.getMessage());
            }
        }
    }
}

