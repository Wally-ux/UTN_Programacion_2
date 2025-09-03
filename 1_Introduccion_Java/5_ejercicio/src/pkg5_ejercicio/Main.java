/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_ejercicio;

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
       Scanner input =  new Scanner (System.in);
       int numero1 , numero2 ,multi , suma , resta, division;
     
       
        System.out.println("Ingrese el primer numero entero: ");
        numero1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo numero entero: ");
        numero2 = Integer.parseInt(input.nextLine());
        
        //operacion aritmeticas:
        suma=numero1 + numero2;
        resta = numero1  - numero2;
        multi = numero1 * numero2;
        division = numero1 / numero2;
        
        System.out.println("la suma de ambos numeros es:  " + suma);
        System.out.println("la resta de ambos numeros es : " + resta);
        System.out.println("la multiplicacion de ambos numeros es : " + multi);
        System.out.println("la division de ambos numeros es :  " + division);
        //observamos que la divisio de 2 numeros entero trunca el resultado, saca la parte decimal
    }
       
}
