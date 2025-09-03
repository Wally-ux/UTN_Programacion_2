/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicio_4 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double precioOriginal ;
       char categoria ;
       
        System.out.print("Ingrese el precio del producto: ");
         precioOriginal = input.nextDouble();
        
        System.out.print("ingrese la categoria del prodcutor (A ; B ; C): ");
        categoria = input.next().toUpperCase().charAt(0);  
// a trasves de la entrada del usuario , convertimos a mayuscula, tomamos el 1er caracter
        
        double descuento = 0;

        // Selección de descuento según categoría
        switch (categoria) {
            case 'A':
                descuento = 0.10; // 10% descuento
                break;
            case 'B':
                descuento = 0.15; // 15% descuento 
                break;
            case 'C':
                descuento = 0.20; // 20%
                break;
            default:
                System.out.println("Categoría no válida. Debe ser A, B o C.");
          
            }
         
                double montoDescuento = precioOriginal * descuento;
                 double precioFinal = precioOriginal - montoDescuento;


                System.out.println("Precio original: " + precioOriginal);
                System.out.println("Descuento aplicado: " + descuento*100 + "%"); //pasamos descuento a porcentaje
                System.out.println("Precio final: " + precioFinal);

   
    }
    
}
