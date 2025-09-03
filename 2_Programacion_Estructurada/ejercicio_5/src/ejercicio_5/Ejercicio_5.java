/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicio_5 {


    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int numero ;
       int sumaPares = 0;
       
       System.out.print("Ingrese un numero(cero para terminar): ");
            numero = input.nextInt();
        while (numero != 0) {            
            
            if (numero % 2 == 0) {
                sumaPares += numero;
                
            } 
                System.out.print("Ingrese un numero(cero para terminar): ");
                 numero = input.nextInt();
          }
            System.out.println("la suma de los numeros pares es: " + sumaPares);  
    }
    
}
