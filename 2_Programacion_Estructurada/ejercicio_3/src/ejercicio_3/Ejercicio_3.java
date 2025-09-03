/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicio_3 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad ;
        
        System.out.print("Ingrese su edad por favor : ");
        edad = input.nextInt();
        
        if(edad >=60 ){
            System.out.println("Eres un adulto mayor");
        } else if (edad >=  18){
            System.out.println("Eres un adulto ");
        }else if(edad >= 12  ){
            System.out.println("Eres un adolescente");
        } else {
            System.out.println("Eres un niño");
        }
    }
}
        
        
        
    
    

