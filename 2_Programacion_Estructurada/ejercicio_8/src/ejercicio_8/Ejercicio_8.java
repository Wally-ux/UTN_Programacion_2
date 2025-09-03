/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        //main
         Scanner input = new Scanner(System.in);

        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = input.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = input.nextDouble();

     
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Salida
        System.out.println("El precio final del producto es: " + precioFinal);
    }//cierre de main
    // Método que calcula el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Convertimos porcentaje a decimal
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;

        // formulas para caclculos
        double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
        return precioFinal;
    }
}
 
    


       