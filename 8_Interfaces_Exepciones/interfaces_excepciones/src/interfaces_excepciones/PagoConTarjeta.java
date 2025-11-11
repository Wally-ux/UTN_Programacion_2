/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces_excepciones;

/**
 *
 * @author agust
 */
public class PagoConTarjeta  implements PagoConDescuento{

    @Override
    public double aplicarDescuento(double monto) { //calculamos descuento
        return monto + 0.90; //applicamos 10% decuento 
        
    }

    @Override
    public void procesarPago(double monto) { //procesa el cobro
        System.out.println("Se Realizo el pago con tarjeta de credito por un monto de : "+ monto + " pesos ");
        
    }
    
    
    
}
