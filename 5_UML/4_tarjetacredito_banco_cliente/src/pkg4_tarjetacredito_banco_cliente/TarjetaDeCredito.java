/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg4_tarjetacredito_banco_cliente;

/**
 *
 * @author agust
 */
public class TarjetaDeCredito {
    private final String numero;
    private String fechaVencimiento;

    // Agregación: pertenece a un Banco (uno)
    private Banco emisor;

    // Asociación: tiene un titular (uno)
    private Cliente titular;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco emisor, Cliente titular) {
        this.numero = numero;
        this.fechaVencimiento =fechaVencimiento;
        this.emisor = emisor;
        this.titular = titular;
    }

    public String getNumero() { 
        return numero; }
    
    public String getFechaVencimiento() { 
        return fechaVencimiento; }
    
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Banco getEmisor() {
        return emisor; }
    public void setEmisor(Banco emisor) {
        this.emisor = emisor; 
    }
    public Cliente getTitular() {
        return titular; }
    
    public void setTitular(Cliente titular) { 
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Tarjeta{numero='" + numero + "', vence=" + fechaVencimiento +
               ", emisor="  +
               ", titular=" + 
                 "}";
    }



    @Override
    public int hashCode() { return numero.hashCode(); }
}
