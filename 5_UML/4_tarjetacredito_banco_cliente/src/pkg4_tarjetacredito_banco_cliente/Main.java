/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4_tarjetacredito_banco_cliente;

/**
 *
 * @author agust
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Banco banco = new Banco("Banco Frances", "30-2323233-3");
          
        Cliente pepe = new Cliente("pepe López", "30111222");
        Cliente juancito = new Cliente("Juancito Pérez", "30999888");
        Cliente cristobalito = new Cliente("Cristóbal", "30991234");
        
        TarjetaDeCredito t1 = new TarjetaDeCredito("1717 23232 5678 9010", "24-3-2020", banco, pepe);
        TarjetaDeCredito t2 = new TarjetaDeCredito("3534 3432 2323 3333", "12-2-1998", banco, juancito);
        TarjetaDeCredito t3 = new TarjetaDeCredito("8943 3432 1313 1230", "23-2-1987", banco,cristobalito);

        // Cambiar titular o banco (sin colecciones)
        t2.setTitular(juancito);

        System.out.println(banco);
        System.out.println(pepe);
        System.out.println(juancito);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
    
}
