/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // inicio main
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el peso del paquete: ");
        double peso= Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona= input.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);//parametros que envio a la funcion y almaceno en variable
        double totalPagar = calcularTotalCompra(precio, costoEnvio);//parametros que envio a la funcion y almaceno en variable
        
        System.out.println("el costo de envio es: " + costoEnvio) ;//imprimo las variables
        System.out.println("el total a pagar  es: " + totalPagar) ;

    } //cierre main
    //funcion calcularcostoenvios:
    public static double calcularCostoEnvio(double peso, String zona) {
         double costoEnvio= 0;
                  
        if (zona.equals("nacional")) {
            costoEnvio = (5.0*peso);
        } else if (zona.equals("internacional")) {
            costoEnvio = (10.0*peso);
        } 

         return costoEnvio;
}//funcion caculcar total compra

     public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
         double totalPagar = precioProducto + costoEnvio;
         
         return totalPagar ;
     }
}
