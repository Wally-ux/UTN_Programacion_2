/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_ejercicio;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Main {

   
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     String  nombre;
     int edad;
     
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();
        
         System.out.println("Hola  " + nombre + ", tenes : " + edad + " años");
    }
    
}
