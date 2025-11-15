/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6_reserva_cliente_mesa;

/**
 *
 * @author agust
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              // Crear un cliente
        Cliente cliente1 = new Cliente("Pepito Aviles", "011-151234567");

        // Crear una mesa (agregación: existe fuera de la reserva)
        Mesa mesa1 = new Mesa(5, 4);

        // Crear una reserva asociando cliente y mesa
        Reserva reserva1 = new Reserva(
                "2025-11-20",
                "21:30",
                cliente1,
                mesa1
        );

        // Mostrar la información
        System.out.println(" reserva ");
        System.out.println("Fecha: " + reserva1.getFecha());
        System.out.println("Hora: " + reserva1.getHora());

        System.out.println("\nCliente ");
        System.out.println("Nombre: " + reserva1.getCliente().getNombre());
        System.out.println("Teléfono: " + reserva1.getCliente().getTelefono());
        
        System.out.println(" "); //salto de liinea
        

        System.out.println("Mesa ");
        System.out.println("Número: " + reserva1.getMesa().getNumero());
        System.out.println("Capacidad: " + reserva1.getMesa().getCapacidad());

        System.out.println("\n--- toString completo ---");
        System.out.println(reserva1);
    }
}
    