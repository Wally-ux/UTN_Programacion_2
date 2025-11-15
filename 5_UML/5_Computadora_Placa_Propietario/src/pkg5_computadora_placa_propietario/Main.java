/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5_computadora_placa_propietario;

/**
 *
 * @author agust
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos  un propietario
        Propietario propietario1 = new Propietario("Jhoony Depp ", "12345678");

        // creamos  una computadora con su placa madre (composición)
        Computadora pc1 = new Computadora(
               
                "Lenovo",        // marca
                "SN-001-XYZ",    // número de serie
                "B550M",         // modelo de la placa madre
                "AMD B550"       // chipset
        );

        // vinculamos r la computadora con el dueño (asociación bidireccional)
        pc1.setPropietario(propietario1);

        
        // mostrmomos  datos del propietario usando los getters
        System.out.println("Propietario");
        System.out.println("Nombre: " + propietario1.getNombre());
        System.out.println("DNI: " + propietario1.getDni());
        
        System.out.println(" ");
         
        System.out.println("Computador del propietaroo");
        System.out.println("Marca: " + propietario1.getComputadora().getMarca());
        System.out.println("Número de serie: " + propietario1.getComputadora().getNumeroSerie());

        System.out.println(" ");
        
        System.out.println("\n La Placa madre de la computadora ");
        System.out.println("Modelo: " + propietario1.getComputadora().getPlacaMadre().getModelo());
        System.out.println("Chipset: " + propietario1.getComputadora().getPlacaMadre().getChipset());

       
    }
    }
    

