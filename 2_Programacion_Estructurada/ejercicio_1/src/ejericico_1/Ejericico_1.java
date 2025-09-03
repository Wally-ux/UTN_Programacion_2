/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericico_1;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejericico_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("ingrese un año: ");
        int anio = scan.nextInt();
        
        if ((anio % 4 == 0 && anio %100 != 0) || (anio % 400 == 0)){
            System.out.println("el año " + anio + " es bisiesto.");
           
         } else {
            System.out.println("el año " + anio + " no es bisiesto.");
        }
    }
}
