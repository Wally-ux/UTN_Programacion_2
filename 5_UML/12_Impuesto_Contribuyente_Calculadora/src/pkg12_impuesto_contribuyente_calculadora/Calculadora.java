/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12_impuesto_contribuyente_calculadora;

/**
 *
 * @author agust
 */
public class Calculadora {
       public void calcular(Impuesto impuesto) {
        System.out.println("El  impuesto de: " + impuesto.getContribuyente().getNombre());
        System.out.println("El Monto: " + impuesto.getMonto()+" Pesos");
    }


}
