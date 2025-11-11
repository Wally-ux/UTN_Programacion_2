/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces_excepciones;

/**
 *
 * @author agust
 */
public class PagoConPayPal  implements Pago { //este es otro medio de pago
   

    @Override
    public void procesarPago(double monto) { 
       
        System.out.println("El total a pagar con Paypal es de : " + monto + " pesos");
        System.out.println("El pago se realizo correctamente");
    }

    
    }


