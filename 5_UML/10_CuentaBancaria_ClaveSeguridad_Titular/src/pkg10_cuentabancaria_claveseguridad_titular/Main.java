/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10_cuentabancaria_claveseguridad_titular;

/**
 *
 * @author agust
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // 1) Creamos un titular
        Titular titular1 = new Titular("Ricardo Fort", "30123456");

        // 2) Creamos una cuenta bancaria con su clave de seguridad (composición)
        CuentaBancaria cuenta1 = new CuentaBancaria(
                "0001234500001234567890", // cbu
                800000.50,               // saldo
                "ABC123",                // código de la clave
                "2025-11-20"             // fecha de última modificación
        );

        // 3) Asociamos cuenta y titular (bidireccional)
        cuenta1.setTitular(titular1);

        // 4) Mostramos datos básicos de la cuenta
        System.out.println("=== Cuenta bancaria ===");
        System.out.println("CBU: " + cuenta1.getCbu());
        System.out.println("Saldo: " + cuenta1.getSaldo());

        // 5) Mostramos datos de la clave de seguridad
        System.out.println("\n=== Clave de seguridad ===");
        System.out.println("Código: " + cuenta1.getClaveSeguridad().getCodigo());
        System.out.println("Última modificación: " + cuenta1.getClaveSeguridad().getUltimaModificacion());

        // 6) Mostramos datos del titular
        System.out.println("\n=== Titular ===");
        System.out.println("Nombre: " + cuenta1.getTitular().getNombre());
        System.out.println("DNI: " + cuenta1.getTitular().getDni());

      

        //  actualizacimos la clave
        cuenta1.actualizarClave("XYZ789", "2025-12-01");
        System.out.println("\nClave actualizada: " + cuenta1.getClaveSeguridad());
    }
    }

