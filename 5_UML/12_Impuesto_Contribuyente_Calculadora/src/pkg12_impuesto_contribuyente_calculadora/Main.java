/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12_impuesto_contribuyente_calculadora;

/**
 *
 * @author agust
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un contribuyente
        Contribuyente contribuyente = new Contribuyente("Carlos Tevez", "20-56656787-9");
        //Creamos un im puesto
        Impuesto impuesto = new Impuesto(80000.2, contribuyente);
        //Creamos calculadora
        Calculadora calc = new Calculadora();
        calc.calcular(impuesto); // dependencia de uso

    }
    
}
