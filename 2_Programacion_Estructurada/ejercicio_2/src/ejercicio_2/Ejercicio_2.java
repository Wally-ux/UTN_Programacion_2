/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicio_2 {

   
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int numero1 , numero2 , numero3 ;

        System.out.print("ingrese el Primer numero a comparar: ");
        numero1 = input.nextInt();
        System.out.print("ingrese el Primer segundo a comparar: ");
        numero2 = input.nextInt();
        System.out.print("ingrese el Primer tercero a comparar: ");
        numero3 = input.nextInt();
        
        if (numero1>numero2 && numero1>numero3) {
            System.out.println("el numero " + numero1 + " es mayor");
            } else if  (numero2>numero1 && numero2>numero3){
                System.out.println("el numero " + numero2 + " es mayor");
            }else if(numero3 > numero1 && numero3 > numero2){
                System.out.println("el numero " + numero3 + " es mayor");
            
        }
    }
    
}
