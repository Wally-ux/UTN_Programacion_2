/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio_3;

/**
 *
 * @author agust
 */
public class EmpleadoPlanta extends Empleado {
    
    @Override
    public double calcularSueldo() { 
        return 600; }
    
    @Override
    public String tipo() { 
        return "Planta"; }
   }


