/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculo_motor_conductor;

/**
 *
 * @author agust
 */
public class Vehiculo_Motor_Conductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Creamos un motor (agregación: existe fuera del vehículo)
        Motor motor1 = new Motor("Nafta 1.6", "MTR-12345");

        // instanciamos  un vehículo y asociarle el motor
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota Corolla", motor1);

        // creamos  conductor
        Conductor conductor1 = new Conductor("Moria Casan ", "LIC-124");

        // Asociamos vehículo y conductor (bidireccional)
        vehiculo1.setConductor(conductor1);

        
        System.out.println("------Vehículo -----");
        System.out.println("Patente: " + vehiculo1.getPatente());
        System.out.println("Modelo: " + vehiculo1.getModelo());

        System.out.println("\n++++ Motor +++");
        System.out.println("Tipo: " + vehiculo1.getMotor().getTipo());
        System.out.println("Número de serie: " + vehiculo1.getMotor().getNumeroSerie());

        System.out.println("\n******Conductor *******");
        System.out.println("Nombre: " + vehiculo1.getConductor().getNombre());
        System.out.println("Licencia: " + vehiculo1.getConductor().getLicencia());

        System.out.println("\n--- toString() ---");
        System.out.println(vehiculo1);
        System.out.println(conductor1);
    }
    }
    

