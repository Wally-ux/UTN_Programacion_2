/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_13;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Ejercicio_12 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] precios = new double[5]; 
        double[] precios2 = {199.99 , 299.5 , 149.75 , 399.0 , 89.99};

        System.out.println("Precios originales: ");
        imprimirPreciosOriginales(precios2, 0);  // aca llamamos a la recursividad
        
        // modificamos
        precios2[2] = 129.99;

        System.out.println("Precios modificados: ");
        imprimirPreciosModificados(precios2, 0); // <-- recursivo

     }

    // b Función recursiva para mostrar precios originales
    public static void imprimirPreciosOriginales(double[] arr, int i) {
        if (i == arr.length) return;                      // caso base
        System.out.println("Precios: $" + arr[i]);        // trabajo
        imprimirPreciosOriginales(arr, i + 1);            // paso recursivo
    }

    //recursividad pecios modificadoas
    public static void imprimirPreciosModificados(double[] arr, int i) {
        if (i == arr.length) return;                      // caso base
        System.out.println("Precios: $" + arr[i]);        // trabajo
        imprimirPreciosModificados(arr, i + 1);           // paso recursivo
    }
}
    
    

