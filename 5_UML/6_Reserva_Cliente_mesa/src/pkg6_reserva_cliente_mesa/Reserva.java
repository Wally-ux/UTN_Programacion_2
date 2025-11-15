/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg6_reserva_cliente_mesa;

/**
 *
 * @author agust
 */
public class Reserva {
    
    private String fecha;
    private String hora;

    // Asociación unidireccional: Reserva -> Cliente
    private Cliente cliente;

    // Agregación: Reserva -> Mesa , mesa viene de otra clase
    private Mesa mesa;

    // Constructor
    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    // Getters y setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", cliente=" + cliente +
                ", mesa=" + mesa +
                '}';
    }
}

