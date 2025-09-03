/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8_ejercicicio;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 , num2 ;
        double resultado ;
        
        
        
        System.out.println("ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("ingrese el segundo numero: ");
        num2= Integer.parseInt(input.nextLine());
        
        resultado = num1 / num2;
        System.out.println("resultado de la division es: " + resultado );
      
        resultado = (double)num1 / num2;
        System.out.println("resultado de la division es: " + resultado );
    }
    
}
