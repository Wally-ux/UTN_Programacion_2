/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicio_10;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejericicio_10 {


    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
        System.out.print("Ingrese el stock actual del producto: ");
        int StockActual = input.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int CantidadVendida = input.nextInt();
        System.out.print("Ingrese la cantidad recibida del producto: ");
        int CantidadRecibida = input.nextInt();
        
       int NuevoStock = actualizarStock(StockActual, CantidadVendida, CantidadRecibida); 
    
        System.out.println("El nuevo stock del producto es:  " + NuevoStock);
        
    } // cierra main
    public static int actualizarStock(int StockActual, int CantidadVendida, 
    int CantidadRecibida){
        
               int NuevoStock = StockActual - CantidadVendida + CantidadRecibida;
               return NuevoStock;    
    }
}

