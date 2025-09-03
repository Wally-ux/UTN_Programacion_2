/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_12;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicio_12 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [ ] precios = new double [5];
        
        double [ ] precios2 = {199.99 , 299.5 , 149.75 , 399.0 , 89.99  };
        
        System.out.println("Precios originales: ");
        for (int i = 0; i < precios2.length; i++) {
            double elemento= precios2[i];
            System.out.println("Precios: $" +elemento );
            
        }
        precios2[2] =129.99 ;
        System.out.println("Precios modificados: ");
        for (int i = 0; i < precios2.length; i++) {
            double elemento = precios2[i];
            System.out.println("Precios: $" + elemento );
        }
     }
 }
