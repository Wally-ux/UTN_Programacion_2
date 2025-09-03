/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicio_11;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejericicio_11 {
    
    static double DESCUENTO_ESPECIAL = 0.10;
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.print("Ingrese el precio del producto: ");
        double precio =Double.parseDouble(input.nextLine());
         //creamoss la variable que nos trae el descuento aplicado del metodo
        double descuentoAplicado = calcularDescuentoEspecial(precio);
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + calcularDescuentoEspecial(precio));
        System.out.println("El precio final con descuento es: " + precioFinal); //variable creada en main con un parametro del metodo
    } 
    public static Double calcularDescuentoEspecial(double precio) {
        Double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
       
        return descuentoAplicado ;//retorna el decuento aplicado
    }
            
}
