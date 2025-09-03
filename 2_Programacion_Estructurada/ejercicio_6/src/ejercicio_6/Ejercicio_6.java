/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicio_6 {

 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero ;
    int contadorpositivo=0 , contadorNegativ=0 , contadorCero = 0 ;
    
    
        
        for (int i = 1; i < 11; i++) {
                System.out.print("por favor ingrese el numero " + i + ": ");
                 numero = input.nextInt();
            if (numero >0 ) {
                contadorpositivo= contadorpositivo + 1;
            }else if (numero <0 ) {
                contadorNegativ= contadorNegativ +1 ;
                
            }else {
                contadorCero= contadorCero +1;
            }
 
         }
        System.out.println("resultados: ");
        System.out.println("positivos: " + contadorpositivo);
        System.out.println("negativos: " + contadorNegativ);
        System.out.println("ceros: " + contadorCero);
    
    }
    
}
