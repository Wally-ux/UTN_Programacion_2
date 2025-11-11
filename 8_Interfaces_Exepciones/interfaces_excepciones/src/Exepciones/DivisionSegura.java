/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exepciones;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class DivisionSegura {
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1, num2;

        System.out.println("----------Ingrese dos numeros------------");
        
        System.out.print("Por favor ingrese el Numero uno: ");
        num1 = scan.nextDouble();

        System.out.print("Por favor ingrese el Numero dos: ");
        num2 = scan.nextDouble();

        try { //aca tenemos el bloque donde puede ocrruri una excpcion
            if (num2 == 0) { //validamos si el divisor es 0
                //aca dispara la excepcion
                throw new ArithmeticException("No se puede dividir por 0"); 
            }

            double resultado = num1 / num2; //realiza la division si el divisor es valido
            System.out.println("El resultado de la división es: " + resultado);
            //capturamos la excepcion de division por cero
        } catch (ArithmeticException e) { 
            System.out.println("Error: " + e.getMessage());
        }finally{
            scan.close(); //cerramos el scanner la tomamos como una buena practica
        }
    }
}
