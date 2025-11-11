/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces_excepciones;

/**
 *
 * @author agust
 */
public interface PagoConDescuento extends Pago  { //a traves de este pago tiene descuento
    double aplicarDescuento(double monto); //calcula monto de descuento
    
}
